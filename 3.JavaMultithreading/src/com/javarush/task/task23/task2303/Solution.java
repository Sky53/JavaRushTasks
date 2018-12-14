package com.javarush.task.task23.task2303;

/* 
Запрети создание экземпляров класса
*/
public class Solution {

    public abstract static class Listener {
        public void onMouseDown(int x, int y) {
            //do something on mouse down event
        }

        public void onMouseUp(int x, int y) {
            //do something on mouse up event
        }
    }

    public static void main(String[] args) {

        Listener listener = new Listener() {
            @Override
            public void onMouseDown(int x, int y) {
                super.onMouseDown(x, y);
            }

            @Override
            public void onMouseUp(int x, int y) {
                super.onMouseUp(x, y);
            }
        };

        System.out.println(listener instanceof Listener);
        System.out.println(listener.getClass().getName() + "  "+  Listener.class.getName());
    }
}
