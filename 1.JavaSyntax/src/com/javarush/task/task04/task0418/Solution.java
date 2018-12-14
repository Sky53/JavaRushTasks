package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());

        eqvil(a,b);



    }

    public static void eqvil(int a, int b){

        if (!(a < b)) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}