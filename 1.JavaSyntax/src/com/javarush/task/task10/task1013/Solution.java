package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String Name;
        private String Country;
        private int age;
        private int lenght;
        private String sex;
        private int exp;

        public Human(String Name) {
            this.Name = Name;
            this.Country = null;
            this.age = 99;
            this.lenght = 190;
            this.sex = null;
            this.exp = 99;
        }

        public Human(int age) {
            this.Name = null;
            this.Country = null;
            this.age = age;
            this.lenght = 190;
            this.sex = null;
            this.exp = 99;
        }

        public Human(int age, int exp) {
            this.Name = null;
            this.Country = null;
            this.age = age;
            this.lenght = 190;
            this.sex = null;
            this.exp = exp;
        }

        public Human(String Name, String Country, int age, int lenght, String sex, int exp) {
            this.Name = Name;
            this.Country = Country;
            this.age = age;
            this.lenght = lenght;
            this.sex = sex;
            this.exp = exp;
        }

        public Human(String Name, String Country, int age, int lenght, String sex) {
            this.Name = Name;
            this.Country = Country;
            this.age = age;
            this.lenght = lenght;
            this.sex = sex;
            this.exp = 0;
        }

        public Human(String Name, String Country, int age, int lenght) {
            this.Name = Name;
            this.Country = Country;
            this.age = age;
            this.lenght = lenght;
            this.sex = null;
            this.exp = 0;
        }

        public Human(String Name, String Country, int age) {
            this.Name = Name;
            this.Country = Country;
            this.age = age;
            this.lenght = 0;
            this.sex = null;
            this.exp = 0;
        }

        public Human(String Name, String Country) {
            this.Name = Name;
            this.Country = Country;
            this.age = 0;
            this.lenght = 0;
            this.sex = null;
            this.exp = 0;
        }

        public Human(int age, int lenght, int exp) {
            this.Name = null;
            this.Country = null;
            this.age = age;
            this.lenght = lenght;
            this.sex = null;
            this.exp = exp;
        }

        public Human(String Name, String Country, String sex) {
            this.Name = Name;
            this.Country = Country;
            this.age = 0;
            this.lenght = 0;
            this.sex = sex;
            this.exp = 0;
        }

    }
}
