package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());
        if ((a==b)&&(a!=c)){
            System.out.println(3);
        }
        else if ((a==c)&&(a!=b)){
            System.out.println(2);
        }
        else if ((b==c)&&(b!=a)){
            System.out.println(1);
        }
        else {}
    }
}