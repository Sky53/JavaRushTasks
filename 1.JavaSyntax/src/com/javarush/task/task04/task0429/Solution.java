package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());
        int countp = 0;
        int countm = 0;


        int array[] = {a, b, c};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {

            } else {
                if (array[i] > 0) {
                    countp++;
                } else {
                    countm++;
                }
            }


        }
        System.out.println("количество отрицательных чисел: " + countm);
        System.out.println("количество положительных чисел: " + countp);
    }
}

