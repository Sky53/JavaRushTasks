package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int voll =Integer.parseInt(str);
        int summ = 0;

        while (voll!= -1){
            summ = summ +voll;
            str = bf.readLine();
            voll =Integer.parseInt(str);
        }
        System.out.println(summ - 1);
    }
}
