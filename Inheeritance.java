/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheeritance;

/**
 *
 * @author HP
 */


   // Parent class
class Person {
    String name;

    void displayName() {
        System.out.println("Name: " + name);
    }
}

// Child class
class Student extends Person {
    int age;

    void displayAge() {
        System.out.println("Age: " + age);
    }
}

// Main class
public class Inheeritance{
    public static void main(String[] args) {

        Student s = new Student();
        s.name = "Jemimah";   // inherited from Person
        s.age = 20;

        s.displayName();     // inherited method
        s.displayAge();      // child class method
    }
}
