package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
       HashMap<String,String> map = new HashMap<>();
       map.put("Ф1","И1");
       map.put("Ф2","И1");
       map.put("Ф3","И3");
       map.put("Ф4","И4");
       map.put("Ф1","И5");
       map.put("Ф6","И1");
       map.put("Ф7","И7");
       map.put("Ф8","И8");
       map.put("Ф9","И1");
       map.put("Ф10","И10");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
