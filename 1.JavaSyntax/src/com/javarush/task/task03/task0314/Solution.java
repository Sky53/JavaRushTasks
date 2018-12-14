package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        for (i = 1; i < 11; i++) {
            for (j = 1; j < 11; j++) {
                System.out.print( (i * j) + " ");
            }
            System.out.println();
        }

    }
}

