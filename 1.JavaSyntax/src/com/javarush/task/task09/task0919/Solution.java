package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) {
        try {

            divisionByZero();
        }catch (ArithmeticException exc) {
            exc.printStackTrace();
        }
    }


    public static void divisionByZero() {
        int k = 4 / 0;
        System.out.println(k);
    }
}