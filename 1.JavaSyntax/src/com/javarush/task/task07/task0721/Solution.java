package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[20];
        int maximum;
        int minimum;

        for (int i = 0; i < ints.length; i++){
            ints[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(ints);
        maximum = ints[19];
        minimum = ints[0];

        System.out.print(maximum + " " + minimum);
    }
}
