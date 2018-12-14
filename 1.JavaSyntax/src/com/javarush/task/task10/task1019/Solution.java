package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.*;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> map = new HashMap<String,Integer>();

        while(true ) {
            int number;

            String s = reader.readLine();
            if(!s.equals("")) {
                number = Integer.parseInt(s);

            }else{
                break;
            }

            String name = reader.readLine();
            if (name.equals("")) {
                break;
            }

            map.put(name,number) ;
        }

        for (Map.Entry<String,Integer> pair: map.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}