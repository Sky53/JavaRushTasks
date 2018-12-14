package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[10];
        String[] strings = new String[10];

        for (int i = 0; i< ints.length ; i++){
            strings[i] = bf.readLine();
            ints[i] =strings[i].length();

        }

        for (int i = 0; i< ints.length ; i++){
            System.out.println(ints[i]);
        }

    }
}
