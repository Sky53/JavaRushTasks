package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            for (; ; ) {
                //создаем объект, пункт 2
                key = reader.readLine();
                if (key.equals("user")) {
                    person = new Person.User();
                } else if (key.equals("loser")) {
                    person = new Person.Loser();
                } else if (key.equals("coder")) {
                    person = new Person.Coder();
                } else if (key.equals("proger")) {
                    person = new Person.Proger();

                } else {
                    break;
                }


                doWork(person); //вызываем doWork
            }
        }
    }

        public static void doWork (Person person){
            // пункт 3
            if (person instanceof Person.User) {
                ((Person.User) person).live();
            } else if (person instanceof Person.Loser) {
                ((Person.Loser) person).doNothing();
            } else if (person instanceof Person.Coder) {
                ((Person.Coder) person).coding();
            } else if (person instanceof Person.Proger) {
                ((Person.Proger) person).enjoy();
            }
        }
    }
