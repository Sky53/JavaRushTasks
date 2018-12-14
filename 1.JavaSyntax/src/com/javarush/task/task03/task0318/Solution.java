package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String name;
        String years;

        BufferedReader bfr = new BufferedReader( new InputStreamReader(System.in));
        years = bfr.readLine();
        name = bfr.readLine();

        System.out.println();
        System.out.println(name + " захватит мир через " + years + " лет. Му-ха-ха!");
    }
}
