package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {


    public static void main(String[] args) throws IOException {
        Map<String, Double> map = new TreeMap<>();

        String fileName = args[0];

        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        while (reader.ready()){
            String str = reader.readLine();
            String[] strings = str.split(" ");
            //map.put(strings[0],Double.parseDouble(strings[1]));
            addMaps(strings[0],Double.parseDouble(strings[1]),map);
        }
        reader.close();

        for (Map.Entry<String,Double> pairMap : map.entrySet()){
            System.out.println(pairMap.getKey() + " " + pairMap.getValue());
        }


    }
    private static void addMaps(String name, Double value, Map<String, Double> map){
        if (map.containsKey(name)){
            map.put(name,map.get(name) + value);
        } else {
            map.put(name,value);
        }
    }
}
