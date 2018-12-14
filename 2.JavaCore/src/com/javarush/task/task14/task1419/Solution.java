package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.io.*;
import java.net.URL;


/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            exceptions.get(-1);
        } catch (Exception exc2){
            exceptions.add(exc2);
        }
        try {
            FileInputStream fis = new FileInputStream("a:/1.txt");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try{
           URL url = new URL("dadawfwafwa");
        }catch (Exception e){
            exceptions.add(e);
        }

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            reader.close();
            reader.readLine();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int n = Integer.parseInt("abc");
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            arr.get(0);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String s = "abc";
            s.charAt(5);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String[] s = new String[-5];
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Integer n = null;
            String s = Integer.toString(n);

        } catch (Exception e) {
            exceptions.add(e);
        }
        //напишите тут ваш код

    }
}
