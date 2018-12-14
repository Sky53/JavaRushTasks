package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(bf.readLine());

        if (((value%2)==0)&&(value < 0))
            System.out.println("отрицательное четное число");
        else {
            if (((value%2)==0)&&(value > 0))
                System.out.println("положительное четное число");
            else {
                if (value == 0)
                    System.out.println("ноль");
                else {
                    if (value < 0)
                        System.out.println("отрицательное нечетное число");
                    else System.out.println("положительное нечетное число");
                }
            }
        }

    }
}
