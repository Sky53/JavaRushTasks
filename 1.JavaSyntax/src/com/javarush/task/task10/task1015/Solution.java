package com.javarush.task.task10.task1015;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() throws IOException {
        ArrayList<String>[] arrayLists = new  ArrayList[3];
        //BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<String> list3 = new ArrayList<String>();

        for ( int i = 0; i < 5; i++){
          //  String string = bufferedReader.readLine();
            list1.add("" + i);
            list2.add(" " +i);
            list3.add("  " +i);
        }
        arrayLists[0] = list1;
        arrayLists[1] = list2;
        arrayLists[2] = list3;
        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}