/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wrapper_class;

/**
 *
 * @author Student
 */
public class using_wrapper_class_methods {
    public static void main(String args[]){
        Integer x=100;
        System.out.println("Binary: "+Integer.toBinaryString(x));//decimal to binary
        System.out.println("Hex: "+Integer.toHexString(x));//decimal to binary
        System.out.println("Compare: "+Integer.compare(x,50));//if above 50 then +ve value = 0 less than 2nd no. -ve value
        System.out.println("Compare: "+Integer.compare(x,100));
        System.out.println("Compare: "+Integer.compare(x,500));
    }   
}
