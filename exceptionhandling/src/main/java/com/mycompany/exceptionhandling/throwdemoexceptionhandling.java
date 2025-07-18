/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptionhandling;

/**
 *
 * @author Student
 */
class throwdemo{
    static void demoproc(){
        try{
            throw new NullPointerException("demo null pointer");
        }
        catch(NullPointerException e){
            System.out.println("nullpointer"+e);
            throw e;//re-throw the exception
        }
    
    }
}
public class throwdemoexceptionhandling {
    public static void main(String args[]){
        try{
            throwdemo.demoproc();
        }
        catch(NullPointerException e){
            System.out.println("Recaught: "+e);
            e.printStackTrace();
        }
        System.out.println("Program continues after handling the exception.");
    }   
}
