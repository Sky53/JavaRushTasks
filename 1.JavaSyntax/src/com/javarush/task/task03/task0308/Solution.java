package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/
class Factorial {

    int factR(int n) {
        int result;

        if (n > 0) {
            return n * factR(n - 1);
        } else {
            return 1;
        }
    }
}

public class Solution {
    public static void main(String[] args) {

        Factorial f = new Factorial();
        System.out.println(f.factR(10));

    }
}
