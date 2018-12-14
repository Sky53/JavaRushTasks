package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
       // System.out.print(s +" -> ");
        for (int i = 0; i < 5; i++) {
            result =result + s;

        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        //System.out.print(s +" -> ");
        for (int i = 0 ; i < count; i++ ) {
            result =result + s;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply("Привет"));
        System.out.println();
        System.out.println(multiply("He ",10));
    }
}
