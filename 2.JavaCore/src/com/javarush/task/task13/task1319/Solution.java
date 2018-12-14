package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));


        String string;

        do {
            string = reader.readLine();

            if (!string.equals("exit")){
                writer.write(string);
                writer.newLine();
            }
            else break;
        }while (!string.equals("exit"));
        reader.close();
        writer.close();
    }
}
