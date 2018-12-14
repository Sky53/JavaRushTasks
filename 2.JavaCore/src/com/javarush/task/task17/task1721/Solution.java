package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string1 = reader.readLine();
        String string2 = reader.readLine();
      //  string1.joinData();

        writeInList(string1, allLines);
        writeInList(string2, forRemoveLines);

    }

    public  void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
            return;
        }

        for (String string : forRemoveLines) {
            if (!allLines.contains(string)) {
                allLines.clear();
                throw new CorruptedDataException();
            }
        }

    }

    public static void writeInList(String file, List<String> list) throws FileNotFoundException {
        BufferedReader in = new BufferedReader(new FileReader(file));

        try {
            String s;
            while ((s = in.readLine()) != null) {
                String[] strings = s.split("\r\n");

                for (String string : strings) {
                    list.add(string);
                }
            }
        } catch (Exception exc) {

        }
    }
}
