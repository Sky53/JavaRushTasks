package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("Фамилия" + i, "Имя" + 1);
        }
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int countFitstName = 0;
        for (Map.Entry<String, String> firstName : map.entrySet()) {
            String key = firstName.getValue();
            if (name.equals(key)) {
                countFitstName++;
            }
        }
        return countFitstName;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int countLastName = 0;
        for (Map.Entry<String, String> findLastName : map.entrySet()) {
            String Value = findLastName.getKey();
            if (lastName.equals(Value)) {
                countLastName++;
            }
        }
        return countLastName;
    }

    public static void main(String[] args) {

    }
}
