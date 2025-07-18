/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stringss;

/**
 *
 * @author Student
 */
public class string_builder {
    public static void main(String args[]){
        String s1="Java";
        String s2=new String("Java");
        System.out.println(s1==s2);//false due to different reference
        System.out.println(s1.equals(s2));//true due to same content
    } 
}
