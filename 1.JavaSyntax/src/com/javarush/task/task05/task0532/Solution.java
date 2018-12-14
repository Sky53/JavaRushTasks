package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());
        int n = maximum;
        int nums;
        maximum = Integer.MIN_VALUE;
        for (int i = 0; i < n ; i++) {
             nums = Integer.parseInt(reader.readLine());
             if (nums < 0) {

             }
            if (nums >= maximum) {
                maximum = nums;
            }
        }

        System.out.println(maximum);
    }
}
