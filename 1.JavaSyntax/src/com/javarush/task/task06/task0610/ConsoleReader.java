package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        return str;
    }

    public static int readInt() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(bf.readLine());
        return i;
    }

    public static double readDouble() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double d = Double.parseDouble(bf.readLine());
        return d;

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        boolean b = Boolean.parseBoolean(bf.readLine());
        return b;

    }

    public static void main(String[] args) {

    }
}
