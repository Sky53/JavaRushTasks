package com.javarush.task.task15.task1530;

public abstract class DrinkMaker {
    abstract void getRightCup();   // Брать подходящую чашку
    abstract void putIngredient(); //положить ингредиенты
    abstract  void pour();         // залять жидкостью.

    public void makeDrink(){
        getRightCup();
        putIngredient();
        pour();
    }
}
