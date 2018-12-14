package com.javarush.task.task13.task1301;

/* 
Пиво
*/
public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Drink {
        void askMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcohol extends Drink {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static abstract class Beer implements Alcohol {

        @Override
        public void sleepOnTheFloor() {

        }


        public abstract void askMore(String message);

        public abstract void sayThankYou();

        public  boolean isReadyToGoHome() {

            return READY_TO_GO_HOME;
        }
    }
}