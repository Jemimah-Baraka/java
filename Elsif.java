/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.elsif;

/**
 *
 * @author HP
 */
public class Elsif {

    public static void main(String[] args) {
        int grade = 74;
        if (grade < 50){
        System.out.println("Work harder");}
        else if (grade < 60){
            System.out.println("Average");
        }
        else if (grade < 70){
            System.out.println("Good");
        }
        else {
            System.out.println("Excellent");
        }
    }
}
