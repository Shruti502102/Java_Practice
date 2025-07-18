/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.regexxx;

/**
 *
 * @author Student
 */
import java.util.regex.*;
public class extractnumbers {
    public static void main(String args[]){
        String input="Order123 Date2025 Total45";
        Matcher m=Pattern.compile("\\d+").matcher(input);
        while(m.find()){
            System.out.println(m.group());
        }
    } 
}
