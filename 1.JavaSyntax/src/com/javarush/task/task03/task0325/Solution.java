package com.javarush.task.task03.task0325;

import java.io.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String salariinhour;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        salariinhour = bf.readLine();

        System.out.println("Я буду зарабатывать $" + salariinhour + " в час");
    }
}
