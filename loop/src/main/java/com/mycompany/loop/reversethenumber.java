/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loop;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class reversethenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose what to reverse:");
        System.out.println("1. Number");
        System.out.println("2. String");
        System.out.println("3. Character array");
        System.out.print("Enter your choice (1/2/3): ");
        int choice = sc.nextInt();
        sc.nextLine();  // consume leftover newline

        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                int num = sc.nextInt();
                int reversedNum = 0;
                int temp = num;
                while (temp != 0) {
                    int digit = temp % 10;
                    reversedNum = reversedNum * 10 + digit;
                    temp /= 10;
                }
                System.out.println("Reversed number: " + reversedNum);
                break;

            case 2:
                System.out.print("Enter a string: ");
                String str = sc.nextLine();
                String reversedStr = new StringBuilder(str).reverse().toString();
                System.out.println("Reversed string: " + reversedStr);
                break;

            case 3:
                System.out.print("Enter characters (as a string): ");
                String input = sc.nextLine();
                char[] chars = input.toCharArray();
                int left = 0, right = chars.length - 1;
                while (left < right) {
                    char tempChar = chars[left];
                    chars[left] = chars[right];
                    chars[right] = tempChar;
                    left++;
                    right--;
                }
                System.out.println("Reversed characters: " + new String(chars));
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}

