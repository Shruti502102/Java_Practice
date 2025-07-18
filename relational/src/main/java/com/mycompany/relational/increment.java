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
public class increment {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("a++ "+(a++));
        System.out.println("a "+a);
        System.out.println("++a "+(++a));
        System.out.println("a "+a);
        System.out.println("b-- "+(b--));
        System.out.println("b "+b);
        System.out.println("--b "+(--b));
        System.out.println("b"+b);
        
        
    }
}
