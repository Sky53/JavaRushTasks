package com.javarush.task.task31.task3101;

import java.io.*;
import java.util.*;

/*
Проход по дереву файлов
*/
public class Solution {
    public static void main(String[] args) throws IOException {

        String path = args[0]; // "d:/1";
        String resultFile = args[1]; // "d:/1.txt";

        ArrayList<File> list = new ArrayList<>();
        allFilesList(new File(path), list);


        Comparator<File> myComparator = new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };


        list.sort(myComparator);

        File resFile = new File(resultFile);
        File newNameFile = new File(resFile.getParent() + "\\" + "allFilesContent.txt");




        if (FileUtils.isExist(newNameFile)) {
            newNameFile.delete();
        }

        FileUtils.renameFile(resFile, newNameFile);

        resFile = newNameFile;


        FileOutputStream fos = new FileOutputStream(resFile);

        for (File fls : list) {

            FileInputStream fis = new FileInputStream(fls);

            byte[] ar = new byte[fis.available()];

            fis.read(ar);

            fos.write(ar);
            fos.write(10);

            fis.close();
        }


        fos.close();


    }

    public static void allFilesList(File path, ArrayList<File> resultList) throws IOException {


        File[] files = path.listFiles();


        for (File fls : files) {

            if (fls.isDirectory())
                allFilesList(fls, resultList);
            else {
                if (fls.getName().endsWith(".txt")) {

                    if (fls.length() <= 50L)
                        resultList.add(fls);

                }
            }


        }


    }


}