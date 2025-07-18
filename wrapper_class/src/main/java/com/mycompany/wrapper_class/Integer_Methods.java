/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wrapper_class;

/**
 *
 * @author Student
 */
public class Integer_Methods {
    public static void main(String args[]){
        Integer obj=50;
        System.out.println(""+Integer.parseInt("123"));
        System.out.println(Integer.valueOf("456"));
        System.out.println(Integer.toString(789));
        System.out.println(Integer.compare(10,20));
        System.out.println(obj.equals(50));
        System.out.println(obj.intValue());
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toHexString(255));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }   
}
