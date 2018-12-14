package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String sVal;
        int iVal;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        sVal = bf.readLine();
        iVal = Integer.parseInt(sVal);

        if (iVal >=0) {
            iVal *=2;
        } else {
            iVal++;
        }
        System.out.println(iVal);
    }

}