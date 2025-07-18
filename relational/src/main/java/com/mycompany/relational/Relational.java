/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.relational;

/**
 *
 * @author Student
 */
import java.util.Scanner;
class Relational {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("a>b "+(a>b));
        System.out.println("a<b "+(a<b));
        System.out.println("a>=b "+(a>=b));
        System.out.println("a<=b "+(a<=b));
        System.out.println("a!=b "+(a!=b));
        System.out.println("a==b "+(a==b));
    }
}
