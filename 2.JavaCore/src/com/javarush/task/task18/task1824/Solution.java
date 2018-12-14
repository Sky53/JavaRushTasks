package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = null;
        while (true){
            String fileName = reader.readLine();
            try {
                fileInputStream = new FileInputStream(fileName);
                fileInputStream.close();
            }catch (FileNotFoundException exc){
                System.out.println(fileName);
                reader.close();
                return;
            }

        }
    }
}
