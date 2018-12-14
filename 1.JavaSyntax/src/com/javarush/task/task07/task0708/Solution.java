package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        for (int i = 0; i < 5; i++){
            strings.add(bf.readLine());
        }


        for (int i = 0; i < strings.size(); i++){
            if (max < strings.get(i).length()) {
                max = strings.get(i).length();
            }
        }
        for (int i = 0; i < strings.size(); i++){
            if (max == strings.get(i).length() ){
                System.out.println(strings.get(i));
            }
        }
    }
}
