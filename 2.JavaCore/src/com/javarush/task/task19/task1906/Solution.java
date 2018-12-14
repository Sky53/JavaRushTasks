package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        FileWriter fileWriter = new FileWriter(reader.readLine());
        reader.close();
        int count = 0;
        while (fileReader.ready()){
            count++;
            int data = fileReader.read();
            if (count % 2 ==00){
                fileWriter.write(data);
            }
        }
        fileReader.close();
        fileWriter.close();
    }
}
