/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wrapper_class;

/**
 *
 * @author Student
 */
public class BoxingUnboxing {
    public static void main(String args[]){
        int a=50;
        Integer obj=a;//Autoboxing-creating a primitive data type based value to an object using wrapper class functions like Integer
        int b=obj;//Auto-unboxing
        System.out.println("Object"+obj);
        System.out.println("Primitive"+b);           
    }   
}
