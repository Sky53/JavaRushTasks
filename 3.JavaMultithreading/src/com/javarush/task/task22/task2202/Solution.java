package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        if (string == null) {
            throw new TooShortStringException();
        }
        String[] strings = string.split(" ");
        if (strings.length < 5) {
            throw new TooShortStringException();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
            } else {
                sb.append(strings[i]).append(" ");
            }
        }
        sb.replace(sb.length() - 1, sb.length(), "");
        return sb.toString();
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
