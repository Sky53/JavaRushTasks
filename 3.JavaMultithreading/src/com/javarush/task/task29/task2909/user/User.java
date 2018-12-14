package com.javarush.task.task29.task2909.user;

public class User {
    private String name;
    private String surname;
    private int age;


    private Work work;

    private boolean man;
    private Address address;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address.getCountry() + " " + address.getCity() + " " + address.getHouse();
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCountry() {
        return address.getCountry();
    }
    public void setCountry(String country) {
        address.setCountry(country);
    }
    public String getCity() {
        return address.getCity();
    }
    public void setCity(String city) {
        address.setCity(city);
    }


    //    public String getCountry() {
//        return country;
//    }
//
//    public void setCountry(String country) {
//        this.country = country;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getAddress() {
//        return country + " " + city + " " + house.house;
//    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

//    public House getHouse() {
//        return house;
//    }
//
//    public void setHouse(House house) {
//        this.house = house;
//    }

    public boolean isMan() {
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }

    public void printInfo() {
        System.out.println("Имя: " + name + "\n" + "Фамилия: " + surname);
    }

    public void printAdditionalInfo() {
        if (this.age < 16) {
            System.out.println("Пользователь моложе 16 лет");
        } else {
            System.out.println("Пользователь старше 16 лет");
        }
    }

    public String getBoss() {
        return getWork().getBoss();
    }
}