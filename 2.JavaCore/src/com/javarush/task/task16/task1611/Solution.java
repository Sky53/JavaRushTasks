package com.javarush.task.task16.task1611;

/* 
Часы
*/

public class Solution {
    public static volatile boolean isStopped = false;
   static   int  countTikTak = 0;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread.sleep(2000);
        isStopped = true;
        System.out.println("Clock has to be stopped");
        Thread.sleep(2000);
        System.out.println("Double-check");
    }

    public static class Clock extends Thread {
        public Clock() {
            setPriority(MAX_PRIORITY);
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTikTak();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTikTak() throws InterruptedException {
            countTikTak++;
           // sleep(500);
            if (countTikTak % 2 == 0) {
                System.out.println("Tak");

            } else {
                System.out.println("Tik");

            }
            sleep(500);
        }
    }
}
