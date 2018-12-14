package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String sYears;
        int iYears;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        sYears = bf.readLine();
        iYears = Integer.parseInt(sYears);

        if ((iYears % 100 ==0) && (iYears % 400 ==0) || (iYears % 100!=0) && (iYears % 4 ==0)) {
            System.out.println("количество дней в году: 366");
        } else {
            System.out.println("количество дней в году: 365");
        }
    }
}