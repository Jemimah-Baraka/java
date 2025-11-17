/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.constructor2;

/**
 *
 * @author HP
 */
public class Constructor2 {

static class Car{
    String color;
    String model;
    int year;
    
    
int getSpeed(int milesDriven, int timeTaken){
    return milesDriven / timeTaken;
    
}
}

    public static void main(String[] args) {
        Car mycar = new Car();
        System.out.println(mycar.getSpeed(120,20));
    }
}
