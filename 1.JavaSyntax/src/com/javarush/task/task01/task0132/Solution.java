package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        return   number/100 +(number - (number/100*100))/10 + number - (number/100*100)  - (number - (number/100*100))/10*10;

    }
}