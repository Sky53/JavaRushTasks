package com.javarush.task.task03.task0322;


/* 
Большая и чистая
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String name;
        String name1;
        String name2;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        name = bf.readLine();
        name1 = bf.readLine();
        name2 = bf.readLine();

        System.out.println(name + " + " + name1 + " + "+ name2 + " = Чистая любовь, да-да!");

    }
}