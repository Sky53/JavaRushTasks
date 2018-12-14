package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[15];
        int maxEven = 0;
        int maxOdd = 0;

        for (int i = 0; i < ints.length; i++){
            ints[i] = Integer.parseInt(bf.readLine());
            int count = (i % 2 == 0) ? (maxEven+=ints[i]) : (maxOdd +=ints[i]);
        }

        if ( maxEven > maxOdd) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }

    }
}
