/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exceptionhandling;

/**
 *
 * @author Student
 */
public class Exceptionhandling {
    public static void main(String[] args) {
        try{//monitor block of code
            int d=0;
            int a=42/d;//arithmetic exception
            System.out.println("This will not be printed.");
        }
        catch(ArithmeticException e){
            //catch divide-bu-zero error
            System.out.println("Divide by zero.");
        }        
        System.out.println("After catch statement.");      
    }
}
