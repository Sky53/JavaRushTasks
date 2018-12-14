package com.javarush.task.task27.task2712.ad;

public class Advertisement {
    private Object content; // video
    private String name;
    private long initialAmount;
    private int hits; // number of paid impressions
    private int duration; // duration in seconds
    private long amountPerOneDisplaying;

    public Advertisement(Object content, String name, long initialAmount, int hits, int duration) {
        this.content = content;
        this.name = name;
        this.initialAmount = initialAmount;
        this.hits = hits;
        this.duration = duration;
        try {
            this.amountPerOneDisplaying = (hits > 0) ? initialAmount / hits : 0;
        }catch (ArithmeticException exc){
            this.amountPerOneDisplaying = 0;

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public long getAmountPerOneDisplaying() {
        return amountPerOneDisplaying;
    }

    public void setAmountPerOneDisplaying(long amountPerOneDisplaying) {
        this.amountPerOneDisplaying = amountPerOneDisplaying;
    }

    public void revalidate(){
        if (hits <=0) {
            throw new UnsupportedOperationException();
        }
//        else {
//            amountPerOneDisplaying +=initialAmount % amountPerOneDisplaying;
//        }
        hits--;
    }

    public int getHits() {
        return hits;
    }

    public boolean canBeViewed() {
        return hits > 0;
    }
}
