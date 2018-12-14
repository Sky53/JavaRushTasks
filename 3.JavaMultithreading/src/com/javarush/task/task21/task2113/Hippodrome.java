package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses = new ArrayList<>();

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }
   static Hippodrome game;

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++){
            move();
            print();
            Thread.sleep(200);
        }

    }

    public void move(){
        for (int i = 0; i < horses.size(); i++){
            horses.get(i).move();
        }

    }

    public void print(){
        for (int i = 0; i < horses.size(); i++){
            horses.get(i).print();
        }
        for (int i = 0; i < 10; i++){
            System.out.println();
        }
    }

    public Horse getWinner() {
        Horse winner = new Horse("Winner",0.0,0.0);
        for (Horse horse : getHorses()){
            if (horse.getDistance() > winner.getDistance()){
                winner = horse;
            }
        }
        return winner;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().name +"!");
    }
    public static void main(String[] args) throws InterruptedException {
        //1
        game = new Hippodrome(new ArrayList<>());
        game.horses.add(new Horse("Bella",3,0));
        game.horses.add(new Horse("Spirit",3,0));
        game.horses.add(new Horse("White",3,0));
        game.horses.add(new Horse("Tom",3,0));
        game.horses.add(new Horse("Loki",3,0));
        game.horses.add(new Horse("Thor",3,0));
        //game.horses.add(new Horse("Соня",3,0));

        game.run();
        game.printWinner();

    }
}
