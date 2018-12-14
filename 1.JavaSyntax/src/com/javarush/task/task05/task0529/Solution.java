package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int cost = Integer.parseInt(str);
        int summ = 0;

        for (; ; ) {
            if (str.equals("сумма")) {
                break;
            } else {
                summ += cost;
                str = bf.readLine();
                if (str.equals("сумма")) {
                    break;
                } else {
                    cost = Integer.parseInt(str);
                }
            }

        }
        System.out.println(summ);
    }

}