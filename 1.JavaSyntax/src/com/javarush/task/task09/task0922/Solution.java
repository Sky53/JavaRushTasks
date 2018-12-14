package com.javarush.task.task09.task0922;

import java.io.*;
import java.util.*;
import java.text.*;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date date = null;
        while (date == null) {
            String line = reader.readLine();
            try {
                date = format.parse(line);
            } catch (ParseException e) {
                System.out.println("Sorry, that's not valid. Please try again.");
            }
        }
        SimpleDateFormat newformat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(newformat.format(date).toUpperCase());

    }
}