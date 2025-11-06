/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.switchstatement;

/**
 *
 * @author HP
 */

    import java.util.Scanner;

public class Switchstatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the weather (Windy, Sunny, Rainy): ");
        String choice = input.nextLine();
        
        switch (choice) {
            case "Windy":
                System.out.println("Wear a heavy sweater");
                break;
            case "Sunny":
                System.out.println("Wear your sunscreen");
                break;
            case "Rainy":
                System.out.println("Wear a raincoat");
                break;
            default:
                System.out.println("Invalid choice");
        }

        input.close();
    }
}
