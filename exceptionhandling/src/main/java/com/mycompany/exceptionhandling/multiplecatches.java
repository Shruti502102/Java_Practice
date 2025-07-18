/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptionhandling;

/**
 *
 * @author Student
 */
//determine multiple catch statements
public class multiplecatches {
    public static void main(String args[]){
        try{
            int a=args.length;
            System.out.println("a = "+a);
            int b=42/a;
            int c[]={1};
            c[42]=99;
        }
        catch(ArithmeticException e){
            System.out.println("Divide by 0: "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bound: "+e);
        }
        System.out.println("After try/catch blocks.");
    }  
}
