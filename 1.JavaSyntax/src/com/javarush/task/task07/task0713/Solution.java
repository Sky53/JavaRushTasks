package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> listfull = new ArrayList<>();
        ArrayList<Integer> listk3 = new ArrayList<>();
        ArrayList<Integer> listk2 = new ArrayList<>();
        ArrayList<Integer> listother = new ArrayList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++){
            listfull.add(Integer.parseInt(bf.readLine()));
        }

        for (int i = 0; i < listfull.size(); i ++){
            if (listfull.get(i) % 3 ==0) {
                listk3.add(listfull.get(i));
            }
            if (listfull.get(i) % 2 == 0){
                listk2.add(listfull.get(i));
            }
            if (listfull.get(i) % 3 !=0 && listfull.get(i) % 2 !=0){
                listother.add(listfull.get(i));
            }

        }

        printList(listk3);
        printList(listk2);
        printList(listother);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
