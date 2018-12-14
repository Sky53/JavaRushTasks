package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        BufferedReader buffFile = new BufferedReader(new FileReader(file));
        int count = 0;
        ArrayList<String> listStr = new ArrayList<>();
        while (buffFile.ready()){
            listStr.add(buffFile.readLine());
        }
        for (String x : listStr) {
            String[] str = x.split(" ");
            for (int i = 0; i < str.length; i++) {
                if(str[i].equals("world")) count++;
                else if(str[i].equals("world,")) count++;
                else if(str[i].equals("world.")) count++;
            }
        }
        System.out.println(count);
        buffFile.close();
    }
}