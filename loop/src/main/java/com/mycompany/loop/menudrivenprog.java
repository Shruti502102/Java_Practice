/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loop;

/**
 *
 * @author Student
 */
import java.util.*;

public class menudrivenprog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose:");
        System.out.println("1. Check Even or Odd");
        System.out.println("2. Check Prime");
        System.out.println("3. Find Factorial");
        System.out.println("4. Exit");

        int choice = sc.nextInt();

        // If user chooses Exit, don't ask for number
        if (choice == 4) {
            System.out.println("Exiting... Goodbye!");
            return;
        }

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Welcome to the Odd Even Zone!\n >*v*<");
                if (num % 2 == 0) {
                    System.out.println(num + " is an even number.");
                } else {
                    System.out.println(num + " is an odd number.");
                }
                break;

            case 2:
                System.out.println("Welcome to the Detective Prime Zone!\n >*=*<");
                boolean isPrime = true;
                if (num <= 1) {
                    isPrime = false;
                } else {
                    for (int i = 2; i <= num / 2; i++) {
                        if (num % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
                if (isPrime) {
                    System.out.println(num + " is a Prime Number.");
                } else {
                    System.out.println(num + " is NOT a Prime Number.");
                }
                break;

            case 3:
                System.out.println("Welcome to the Factorial Facts Zone!\n >*w*<");
                long fact = 1;
                for (int i = 1; i <= num; i++) {
                    fact *= i;
                }
                System.out.println("Factorial of " + num + " is: " + fact);
                break;

            case 4:
                System.out.println("Exiting... Goodbye!");
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}

