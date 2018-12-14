package com.javarush.task.task35.task3513;

import java.util.*;

public class Model {
    private static final int FIELD_WIDTH = 4;
    private Tile[][] gameTiles;
    protected int score = 0;
    protected int maxTile = 0;
    private Stack<Tile[][]> previousStates = new Stack<>();
    private Stack<Integer> previousScores = new Stack<>();
    private boolean isSaveNeeded = true;

    public Model() {
        resetGameTiles();
        this.score = 0;
        this.maxTile = 0;

    }

    private List<Tile> getEmptyTiles() {
        List<Tile> list = new ArrayList<>();
        for (int i = 0; i < FIELD_WIDTH; i++) {
            for (int j = 0; j < FIELD_WIDTH; j++) {
                if (gameTiles[i][j].isEmpty()) {
                    list.add(gameTiles[i][j]);
                }
            }
        }
        return list;
    }

    private void addTile() {
        if (getEmptyTiles().size() > 0) {
            Tile tile = getEmptyTiles().get((int) (Math.random() * getEmptyTiles().size()));
            tile.value = Math.random() < 0.9 ? 2 : 4;

        }
    }

    void resetGameTiles() {
        gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < FIELD_WIDTH; i++) {
            for (int j = 0; j < FIELD_WIDTH; j++) {
                gameTiles[i][j] = new Tile();
            }
        }
        addTile();
        addTile();
    }

    private Boolean compressTiles(Tile[] tiles) {

        int num = 0;
        for (int i = 0; i < tiles.length; i++) {
            for (int j = i + 1; j < tiles.length; j++) {
                if (j <= tiles.length - 1 && tiles[i].isEmpty() && !tiles[j].isEmpty()) {
                    Tile current = tiles[j];
                    tiles[j] = tiles[i];
                    tiles[i] = current;
                    num++;
                }
            }
        }

        return num > 0;
    }

    private Boolean mergeTiles(Tile[] tiles) {

        int num = 0;
        for (int i = 0; i < tiles.length; i++) {
            if (i <= tiles.length - 2 && tiles[i].value == tiles[i + 1].value && tiles[i].value > 0) {
                tiles[i].value += tiles[i + 1].value;
                score += tiles[i].value;
                if (tiles[i].value > maxTile) {
                    maxTile = tiles[i].value;
                }
                tiles[i + 1].value = 0;
                i++;
                num++;
            }
        }
        compressTiles(tiles);

        return num > 0;
    }

    private void saveState(Tile[][] step) {
        Tile[][] saveGame = new Tile[step.length][step[0].length];

        for (int i = 0; i < step.length; i++) {
            for (int j = 0; j < step[0].length; j++) {
                saveGame[i][j] = new Tile(step[i][j].getValue());
            }
        }
        previousStates.push(saveGame);
        int sorceToSave = score;
        previousScores.push(sorceToSave);
        isSaveNeeded = false;
    }

    public void rollback() {
        if (!previousStates.isEmpty() && !previousScores.isEmpty()) {
            this.score = previousScores.pop();
            this.gameTiles = previousStates.pop();
        }

    }


    public void turn() {
        Tile[][] array = new Tile[FIELD_WIDTH][FIELD_WIDTH];

        for (int i = 0; i < FIELD_WIDTH; i++) {
            for (int j = FIELD_WIDTH - 1; j >= 0; j--) {
                array[i][gameTiles.length - j - 1] = gameTiles[j][i];
            }
        }

        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                gameTiles[i][j] = array[i][j];
            }
        }
    }

    public void left() {
        if (isSaveNeeded) {
            saveState(this.gameTiles);
        }
        boolean moveit = false;
        for (int i = 0; i < gameTiles.length; i++) {
            boolean compress = compressTiles(gameTiles[i]);
            boolean merge = mergeTiles(gameTiles[i]);
            if (compress | merge) {
                moveit = true;
            }
        }
        if (moveit) {
            addTile();
        }
        isSaveNeeded = true;
    }

    public void right() {
        saveState(this.gameTiles);
        turn();
        turn();
        left();
        turn();
        turn();
    }

    public void up() {
        saveState(this.gameTiles);
        turn();
        turn();
        turn();
        left();
        turn();

    }

    public void down() {
        saveState(this.gameTiles);
        turn();
        left();
        turn();
        turn();
        turn();

    }

    public Tile[][] getGameTiles() {
        return gameTiles;
    }

    public boolean canMove() {
        if (!getEmptyTiles().isEmpty()) {
            return true;
        }

        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 1; j < gameTiles.length; j++) {
                if (gameTiles[i][j].value == gameTiles[i][j - 1].value) {
                    return true;
                }
            }
        }

        for (int j = 0; j < gameTiles.length; j++) {
            for (int i = 1; i < gameTiles.length; i++) {
                if (gameTiles[i][j].value == gameTiles[i - 1][j].value) {
                    return true;
                }
            }
        }
        return false;

    }

    public void randomMove() {
        //int n = ((int) (Math.random() * 100)) % 4;
        int n = ((int) (Math.random() * 4));
        switch (n) {
            case 1:
                left();
                break;
            case 2:
                right();
                break;
            case 3:
                up();
                break;
            case 0:
                down();
                break;
        }
    }

    private boolean hasBoardChanged() {
        int sumNow = 0;
        int sumPrevious = 0;
        Tile[][] tmp = previousStates.peek();
        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 0; j < gameTiles[0].length; j++) {
                sumNow += gameTiles[i][j].getValue();
                sumPrevious += tmp[i][j].getValue();
            }
        }
        return sumNow != sumPrevious;
    }

    private MoveEfficiency getMoveEfficiency(Move move) {
        MoveEfficiency moveEfficiency;
        move.move();
        if (hasBoardChanged()) {
            moveEfficiency = new MoveEfficiency(getEmptyTiles().size(), score, move);
        } else {
            moveEfficiency = new MoveEfficiency(-1, 0, move);
        }
        rollback();

        return moveEfficiency;
    }

    public void autoMove() {
        PriorityQueue<MoveEfficiency> queue = new PriorityQueue(4, Collections.reverseOrder());
        queue.add(getMoveEfficiency(this::left));
        queue.add(getMoveEfficiency(this::right));
        queue.add(getMoveEfficiency(this::up));
        queue.add(getMoveEfficiency(this::down));
        Move move = queue.peek().getMove();
        move.move();
    }


}