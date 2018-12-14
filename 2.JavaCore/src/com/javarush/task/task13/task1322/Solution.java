package com.javarush.task.task13.task1322;

/* 
Интерфейс SimpleObject
*/

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject<Object>();

    }


    public static class StringObject<Object> implements SimpleObject{

        @Override
        public SimpleObject<String> getInstance() {
            return new StringObject<>();
        }
    }
    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

}

