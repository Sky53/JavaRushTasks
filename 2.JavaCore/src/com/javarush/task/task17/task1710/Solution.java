package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); // 15/04/1990

        if (args[0].equals("-c")){
            if(args[2].equals("м"))
                allPeople.add(Person.createMale(args[1], format.parse(args[3])));
            else
                allPeople.add(Person.createFemale(args[1], format.parse(args[3])));

            System.out.println(allPeople.size()-1);
        }

        else if (args[0].equals("-u")){
            if (args[3].equals("м"))
                allPeople.set(Integer.parseInt(args[1]), Person.createMale(args[2], format.parse(args[4])));
            else allPeople.set(Integer.parseInt(args[1]), Person.createFemale(args[2], format.parse(args[4])));
        }

        else if (args[0].equals("-d")){
            allPeople.get(Integer.parseInt(args[1])).setName(null);
            allPeople.get(Integer.parseInt(args[1])).setSex(null);
            allPeople.get(Integer.parseInt(args[1])).setBirthDay(null);
        }


        else if (args[0].equals("-i"))
        {
            SimpleDateFormat formaT = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
            Person person = allPeople.get(Integer.parseInt(args [1]));

            if (person.getSex().equals(Sex.MALE))
                System.out.println(person.getName() + " м " + formaT.format(person.getBirthDay()));
            else
                System.out.println(person.getName() + " ж " + formaT.format(person.getBirthDay()));
        }
    }
}

