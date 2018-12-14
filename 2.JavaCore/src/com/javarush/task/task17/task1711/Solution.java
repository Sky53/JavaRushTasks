package com.javarush.task.task17.task1711;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();
    public static DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws Exception {
        //start here - начни тут
        synchronized (allPeople) {
            switch (args[0]) {
                case "-c":
                    synchronized (allPeople) {
                        for (int i = 1, f = 2, g = 3; g < args.length; i += 3, f += 3, g += 3)
                            create(new String[]{args[i], args[f], args[g]});
                        break;
                    }
                case "-u":
                    synchronized (allPeople) {
                        for (int i = 1, f = 2, g = 3, h = 4; h < args.length; i += 4, f += 4, g += 4, h += 4)
                            update(new String[]{args[i], args[f], args[g], args[h]});
                        break;
                    }
                case "-d":
                    synchronized (allPeople) {
                        for (int i = 1; i <= args.length - 1; i++)
                            delete(Integer.parseInt(args[i]));
                        break;
                    }
                case "-i":
                    synchronized (allPeople) {
                        for (int i = 1; i <= args.length - 1; i++)
                            print(Integer.parseInt(args[i]));
                        break;
                    }
                default:
                    synchronized (allPeople) {
                        break;
                    }

            }
        }
    }

    public static void create (String[] args) throws Exception{
        if(args[1].equals("м")){
            allPeople.add(Person.createMale(args[0], format.parse(args[2])));
        } else {
            allPeople.add(Person.createFemale(args[0], format.parse(args[2])));
        }
        System.out.println(allPeople.size() - 1);
    }

    public static void update (String[] args) throws Exception{
        allPeople.get(Integer.parseInt(args[0])).setName(args[1]);
        if (args[2].equals("м")) allPeople.get(Integer.parseInt(args[0])).setSex(Sex.MALE);
        else allPeople.get(Integer.parseInt(args[0])).setSex(Sex.FEMALE);
        allPeople.get(Integer.parseInt(args[0])).setBirthDay(format.parse(args[3]));
    }

    public static void delete (int i) {
        allPeople.get(i).setName(null);
        allPeople.get(i).setSex(null);
        allPeople.get(i).setBirthDay(null);
    }

    public static void print (int i) {
        DateFormat form = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        System.out.println(
                allPeople.get(i).getName() + " " +
                        simpleSex(allPeople.get(i).getSex()) + " " +
                        form.format(allPeople.get(i).getBirthDay())

        );
    }

    public static String simpleSex (Sex sex){
        if (sex.equals(Sex.MALE)) return "м";
        else return "ж";
    }
}

