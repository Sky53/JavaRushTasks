package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String sValue = bf.readLine();
        int iValue = Integer.parseInt(sValue);
        int cont = sValue.length();

        if (iValue < 0 || iValue == 0){
            //System.out.println("BIL 0");
        } else{
            if (iValue % 2 == 0 && cont == 1) {
                System.out.println("четное однозначное число");
            } else {
                if (iValue % 2 == 0 && cont == 2) {
                    System.out.println("четное двузначное число");
                } else {
                    if (iValue % 2 == 0 && cont == 3) {
                        System.out.println("четное трехзначное число");
                    } else {
                        if (iValue % 2 != 0 && cont == 1) {
                            System.out.println("нечетное однозначное число");
                        } else {
                            if (iValue % 2 != 0 && cont == 2) {
                                System.out.println("нечетное двузначное число");
                            } else {
                                if (iValue % 2 != 0 && cont == 3) {
                                    System.out.println("нечетное трехзначное число");
                                }

                            }
                        }
                    }

                }
            }
        }
    }
}