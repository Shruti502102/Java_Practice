/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptionhandling;

/**
 *
 * @author Student
 */
public class onlyone_Supersubcatch {
    public static void main(String args[]){
        try{
            int a=0;
            int b=423/a;
        }
        catch(Exception e){
            System.out.println("Generic Exception catch.");
        }
        /*This catch is never reached because Arithmetic Exception is a sub class of Exception.*/
        catch(ArithmeticException e){
            System.out.println("This is never reached.");//error=unreachable
        }
    }  
}
