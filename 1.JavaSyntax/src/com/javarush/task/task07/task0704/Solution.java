package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[10];

        for (int i = ints.length - 1; i >=0; i--){
            String string = bf.readLine();
            ints[i] = Integer.parseInt(string);
        }

        for (int i = 0; i < ints.length; i++){
            System.out.println(ints[i]);
        }
    }
}

