package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(40,79.15));
        System.out.println(convertEurToUsd(67,78.5));
            }

    public static double convertEurToUsd(int eur, double course) {
        return eur * course;
    }
}
