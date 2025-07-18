/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptionhandling;

/**
 *
 * @author Student
 */
public class finallyblockineceptionhandling {
    public static void main(String args[]){
        test();
    }
    public static void test(){
        try{
            throw new NullPointerException("NPE");
        }
        catch(Exception e){
            System.out.println("NullPointerException");
        }
        finally{
            System.out.println("finally");
        }
    }
    
}
