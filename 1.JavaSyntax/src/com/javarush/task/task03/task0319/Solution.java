package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String name;
        String years;
        String salary;
        BufferedReader bfr = new BufferedReader( new InputStreamReader(System.in));

        // System.out.println("Веедите имя гражданияна");
        name = bfr.readLine();

        //System.out.println("Веедите время в годах");
        salary = bfr.readLine();
        years = bfr.readLine();
        //years = Integer.parseInt(yars);

        System.out.println();
        System.out.println(name + " получает " + salary + " через " + years +" лет.");
    }
}
