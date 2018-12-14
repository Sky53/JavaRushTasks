package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/
import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(new FileInputStream(reader.readLine()));
        ArrayList<Integer> list = new ArrayList<>();

        while (scan.hasNext()) {
            int i = scan.nextInt();
            if (i % 2 == 0) {
                list.add(i);
            }
        }
        scan.close();

        Collections.sort(list);
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
