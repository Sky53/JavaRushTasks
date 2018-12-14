package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> children1 = new ArrayList<Human>();
        Human child1 = new Human("child1",true,8,new ArrayList<Human>());
        Human child2 = new Human("child2",true,8,new ArrayList<Human>());
        Human child3 = new Human("child3",true,8,new ArrayList<Human>());

        children1.add(child1);
        children1.add(child2);
        children1.add(child3);

        Human father = new Human("father",true,52,children1);
        Human mother = new Human("mother",false,48,children1);

        ArrayList<Human> children2 = new ArrayList<Human>();
        children2.add(father);
        ArrayList<Human> children3 = new ArrayList<Human>();
        children3.add(mother);

        Human ded1 = new Human("ded1",true,92,children2);
        Human babka1 = new Human("babka1",false,88,children2);
        Human ded2 = new Human("ded2",true,94,children3);
        Human babka2 = new Human("babka2",false,85,children3);

        System.out.println(ded1);
        System.out.println(babka1);
        System.out.println(ded2);
        System.out.println(babka2);

        System.out.println(father);
        System.out.println(mother);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children;

        Human(String name, Boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        Human(String name, Boolean sex, int age, ArrayList<Human> children) {
            this(name,sex,age);
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
