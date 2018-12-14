package com.javarush.task.task07.task0705;

/* 
Один большой массив и два маленьких
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int big[] = new int[20];


        for (int i = 0; i < big.length; i++) {
            big[i] = Integer.parseInt(bf.readLine());

        }

//        for (int j = 0; j < 10; j++) {
//            System.out.print(min1[j]);
//        }
        int[] min1 = new int[10];
        int[] min2 = new int[10];

        for (int i = 0; i < big.length; i++) {
            int i1 = (i < big.length / 2) ? (min1[i] = big[i]) : (min2[i - 10] = big[i]);
        }
        for (int j = 0; j < 10; j++) {
            System.out.println(min2[j]);
        }

    }
}