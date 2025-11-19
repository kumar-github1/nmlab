package com.example;
import main.java.com.*;
import java.util.*;
import java.lang.*;

public class App 
{
    {
    List<Student> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    }
    public static void main(String[] args)
    {
        while(true) {
            System.out.println("1. Add a student\n2.Remove a student\n3.Student Details\n4.Edit the Student");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addStudent();        
                    break;
                case 2:
                    removeStudent();
                case 3:
                    studentDetails();
                case 4:
                    editStudentDetails();
                default:
                    break;
            }
        }
    }


    public static void addStudent(){
        System.out.println("Enter the name:");
        String name = scanner.nextLine();
        System.out.println("Enter the age:");
        int age = scanner.nextInt();
        System.out.println("Enter the Year:");
        int year = scanner.nextInt();
        Student student = new Student(name, age, year);
        list.add(student);
    }
}
