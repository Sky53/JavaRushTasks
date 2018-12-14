package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String sNumer = bf.readLine();
        int iNumer =Integer.parseInt(sNumer);
        int result;
        int nums[] = new int[sNumer.length()];

        for (int i = 0; i < sNumer.length(); i++){
            nums[i] =iNumer % 10;
            iNumer /=10;
           result = nums[i] % 2 == 0 ? even++: odd++;

        }
        System.out.println("Even: "+ even + " Odd: " + odd);

    }
}
