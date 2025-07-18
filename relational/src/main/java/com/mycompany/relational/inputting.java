/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.relational;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class inputting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name=sc.nextLine();
        System.out.println("Enter your Age: ");
        int age=sc.nextInt();
        System.out.println("Hello, "+name+", you are "+age+" years old.");
    }    
}
