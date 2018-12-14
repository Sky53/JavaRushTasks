package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());

        if ( a == b && a ==c) {
            System.out.println( a + " " + b + " " + c );
        }
        if (a == b && a != c) {
            System.out.println(a + " " + b);
        }
        if (b == c && b != a){
            System.out.println(b + " " + c);
        }
        if (a == c && a != b){
            System.out.println(a + " " + c);
        }
    }
}