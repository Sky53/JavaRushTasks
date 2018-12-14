package com.javarush.task.task03.task0309;

/* 
Сумма 5 чисел
*/

class SummR {
    int summR(int n) {
        int result = 0;
        if (n == 1) {
            return 1;

        } else {
            return n + summR(n - 1);
        }
    }

}


public class Solution {
    public static void main(String[] args) {
        SummR sF = new SummR();
        for (int i = 1; i < 6; i++) {
            System.out.println(sF.summR(i));
        }
    }
}
