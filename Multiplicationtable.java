/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multiplicationtable;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class Multiplicationtable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int num = input.nextInt();
        int i;
        for(i=1;i<=10;i++)
        {
        System.out.println(num +" * " +i + "=" + (num*i));
        }
    }
}
