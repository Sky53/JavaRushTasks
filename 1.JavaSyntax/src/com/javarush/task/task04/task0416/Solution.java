package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(bf.readLine())%5;

        if ((a>=0 && a<3) || (a>=5 && a<=7)) System.out.println("зеленый");
        else if((a>=3 && a<4) || (a>=7 && a<8)) System.out.println("жёлтый");
        else if((a>=4 && a<5) || (a>=8 && a<9)) System.out.println("красный");
    }

}
