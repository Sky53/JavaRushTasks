package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 600);
        hashMap.put("B", 750);
        hashMap.put("C", 850);
        hashMap.put("D", 950);
        hashMap.put("F", 1100);
        hashMap.put("G", 450);
        hashMap.put("H", 400);
        hashMap.put("W", 300);
        hashMap.put("U", 390);
        hashMap.put("J", 150);

        return hashMap;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            int value = pair.getValue();
            if (value < 500)
                iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}