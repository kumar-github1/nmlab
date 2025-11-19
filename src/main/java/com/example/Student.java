package com.example;

public class Student {
    String name;
    int age;
    int year;
    
    public Student(String name, int age, int year) {
        this.name = name;
        this.age = age;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
