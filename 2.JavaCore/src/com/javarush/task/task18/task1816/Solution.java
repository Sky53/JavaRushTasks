package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        int count = 0;
        if (args.length > 0) {
            FileInputStream fileInputStream = new FileInputStream(args[0]);
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                if ((data >= Integer.valueOf('A') && data <= Integer.valueOf('Z'))
                        ||(data >= Integer.valueOf('a') && data <= Integer.valueOf('z'))) {
                    count++;
                }
            }
            fileInputStream.close();
        }
        System.out.println(Integer.valueOf(count));
    }
}
