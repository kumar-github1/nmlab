package com.example;
import java.util.*;

public class App 
{
    static List<Student> list = new ArrayList<>();
    public static void main(String[] args)
    {
            Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("1. Add a student\n2.Remove a student\n3.Student Details\n4.Edit the Student");
            int choice = scanner.nextInt();
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


    private static void studentDetails() {
    }


    private static void removeStudent() {
    }


    private static void editStudentDetails() {
    }


    public static void addStudent(){
            Scanner scanner = new Scanner(System.in);

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
