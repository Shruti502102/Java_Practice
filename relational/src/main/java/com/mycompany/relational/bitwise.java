/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.relational;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class bitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("a&b "+(a&b));
        System.out.println("a|b "+(a|b));
        System.out.println("a^b "+(a^b));
        System.out.println("~b "+(~b));
        System.out.println("a&b "+(a&b));
        System.out.println("a<<1 "+(a<<1));
        System.out.println("a>>1 "+(a>>1));
    }
    
}
