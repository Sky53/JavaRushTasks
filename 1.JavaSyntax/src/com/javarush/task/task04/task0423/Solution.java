package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name = bf.readLine();
        int years = Integer.parseInt(bf.readLine());

        if (years >20) {
            System.out.println("И 18-ти достаточно");
        }
    }
}
