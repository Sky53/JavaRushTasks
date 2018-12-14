package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        String sA;
        String sB;
        String sC;
        int iA;
        int iB;
        int iC;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        sA = bf.readLine();
        sB = bf.readLine();
        sC = bf.readLine();

        iA = Integer.parseInt(sA);
        iB = Integer.parseInt(sB);
        iC = Integer.parseInt(sC);

       if ((iA  >=  (iB + iC)) || (iB >=(iA + iC)) || (iC >=(iA + iB))) {
           System.out.println("Треугольник не существует.");
       } else {
           System.out.println("Треугольник существует.");
       }
    }
}