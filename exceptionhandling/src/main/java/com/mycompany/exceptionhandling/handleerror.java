/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptionhandling;

/**
 *
 * @author Student
 */
public class handleerror {
    public static void main( String args[]){
        int a=123456,b=0;
        for(int i=10;i>-5;i--)
        {
            try{
                b=a/i;
                System.out.println(b);
            }
            catch(ArithmeticException e){
                System.out.println("Division by zero.");//to print your custom message
                System.out.println("Exception: "+e);//to print system generated error message
                a=123456;//set to 1234 and continue****...
            }
        }
        System.out.println("This is continuation of program.");
    } 
}
