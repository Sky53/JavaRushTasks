package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws IOException {
        int countSpace = 0;
        int countAll = 0;
        FileInputStream fileInputStream = new FileInputStream(args[0]);

        while (fileInputStream.available() > 0) {
            countAll++;
            if (fileInputStream.read() == ' ') {
                countSpace++;
            }
        }
        double result = (double) ((double) countSpace/countAll *100.0);
        System.out.println(String.format(Locale.ENGLISH, "%.2f", result));
        fileInputStream.close();
    }

}
