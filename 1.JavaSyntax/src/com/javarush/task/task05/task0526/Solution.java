package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("It",666,"Vyazov 13");
        Man man1 = new Man("he",766,"Vyazov 15");
        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(man1.name + " " + man1.age + " " + man1.address);

        Woman woman = new Woman("Dura",26,"So mnoy");
        Woman woman1 = new Woman("Dura2",33," ne So mnoy");

        System.out.println(woman.name + " " + woman.age + " " + woman.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);


    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age,String address ){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age,String address ){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
