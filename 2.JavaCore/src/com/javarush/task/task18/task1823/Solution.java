package com.javarush.task.task18.task1823;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename;
        while (!(filename = reader.readLine()).equals("exit")) {
            new ReadThread(filename).start();
        }
        reader.close();
    }

    public static class ReadThread extends Thread {
        String fileName;

        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;

        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run() {
            try {
                while (!interrupted()) {
                    FileInputStream in = new FileInputStream(fileName);
                    ArrayList<Integer> list = new ArrayList<>();
                    while (in.available() > 0) {
                        list.add(in.read());
                    }
                    int maxFrequancy = Collections.frequency(list, list.get(0));
                    int key = list.get(0);
                    for (int i = 1; i < list.size(); i++) {
                        int frequancy = Collections.frequency(list, list.get(i));
                        if (maxFrequancy < frequancy) {
                            maxFrequancy = frequancy;
                            key = list.get(i);
                        }
                    }
                    resultMap.put(fileName, key);
                    in.close();
                    Thread.currentThread().interrupt();
                }
            } catch (Exception e) {
                System.out.println(e);
            }


        }

    }
}

