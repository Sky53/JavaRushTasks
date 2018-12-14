package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();

        char[] array = str.replace(" ", "").toCharArray();
        List<Character> vowels = new ArrayList<>();
        List<Character> novowels = new ArrayList<>();

        for ( char ch : array){
            if (isVowel(ch) == true){
                vowels.add(ch);
            }else {
                novowels.add(ch);
            }
        }
        for (Character character : vowels){
            System.out.print(character + " ");
        }
        System.out.println();
        for (Character character: novowels){
            System.out.print(character + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}