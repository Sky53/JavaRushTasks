package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    int top, left, width , height;

    public Rectangle (int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public Rectangle(int top, int left){
        this.top = top;
        this.left = left;
        this.height = 0;
        this.width = 0;
    }
    public Rectangle(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = this.height = width;
    }
    public Rectangle(Rectangle obj) {
        this.top = obj.top;
        this.left = obj.left;
        this.width = obj.width;
        this.height = obj.height;
    }


    public static void main(String[] args) {

    }
}
