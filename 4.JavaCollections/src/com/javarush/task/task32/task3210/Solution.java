package com.javarush.task.task32.task3210;

import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) {
        String fileName = args[0];
        long number = Long.parseLong(args[1]);
        String text = args[2];

        try (RandomAccessFile file = new RandomAccessFile(fileName, "rw")) {
            byte[] bytes = new byte[text.length()];
            file.seek(number);
            file.read(bytes, 0, bytes.length);
            String readbyte = convertByteToString(bytes);
            String result = readbyte.equals(text) ? "true" : "false";
            file.seek(file.length());
            file.write(result.getBytes());
        } catch (IOException exc) {
            System.out.println(exc);
        }
    }

    private static String convertByteToString(byte[] bytes) {
        return new String(bytes);
    }
}
