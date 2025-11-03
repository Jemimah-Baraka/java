/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.method;

/**
 *
 * @author HP
 */
public class Method {
    public static void main(String[] args){
        sayHello("Alice");
        int square = squaredNo(3);
        System.out.println("Square: " + square);
    }
   static void sayHello(String name){
       System.out.println("Hello" +name);
   } 
   static int squaredNo(int num){
       return num * num;
   }
}
