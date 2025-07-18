/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        
        System.out.println("Sum "+(a+b));
        System.out.println("Differnce  "+(a-b));
        System.out.println("Division "+(a/b));
        System.out.println("Modulus "+(a%b));
        System.out.println("Multiplication "+(a*b));
        
    }
    
}
