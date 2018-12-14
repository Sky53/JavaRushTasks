package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        Human grandfatet = new Human("Ded",true,78);
        Human grandfatet1 = new Human("Ded1",true,80);
        Human grandmother = new Human("Babka",false,77);
        Human grandmother1 = new Human("Babka1",false,85);
        Human fater = new Human("PApa",true,35,grandfatet,grandmother);
        Human mother = new Human("MAma",false,37,grandfatet,grandmother);
        Human brother = new Human("Bro1",true,22,fater,mother);
        Human brother1 = new Human("Bro2",true,18,fater,mother);
        Human sister = new Human("Dura",false,20,fater,mother);

        System.out.println(grandfatet);
        System.out.println(grandmother);
        System.out.println(grandfatet1);
        System.out.println(grandmother1);
        System.out.println(fater);
        System.out.println(mother);
        System.out.println(brother);
        System.out.println(brother1);
        System.out.println(sister);

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        Human (String name, boolean sex, int age, Human father, Human mother){
            this(name,sex, age);
            this.father = father;
            this.mother = mother;
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















