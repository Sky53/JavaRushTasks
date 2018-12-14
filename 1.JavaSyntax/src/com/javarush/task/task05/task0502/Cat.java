package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {

    }

    public boolean fight(Cat anotherCat) {
        return ((this.weight * this.strength) / this.age) > ((anotherCat.weight * anotherCat.strength) / anotherCat.age);
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 5;
        cat1.weight = 10;
        cat1.strength = 10;

        Cat cat2 = new Cat();
        cat2.age = 10;
        cat2.weight = 10;
        cat2.strength = 10;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));

    }
}
