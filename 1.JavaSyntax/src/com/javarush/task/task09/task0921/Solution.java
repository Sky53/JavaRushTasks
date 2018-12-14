package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        readData();
    }

    public static void readData() throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            try{
                list.add(sc.nextInt());
            }catch(Exception e){
                for(int i = 0; i < list.size(); i++){
                    System.out.println(list.get(i));


                }

            }
        }
    }
}
