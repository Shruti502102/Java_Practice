/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.regexxx;

/**
 *
 * @author Student
 */
import java.util.*;
public class panvalidator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String pan="ABHDS2221F";
        System.out.println("Eg:"+pan);
        System.out.println(pan.matches("[A-Z]{5}[0-9]{4}[A-Z]"));
        String pan1=sc.nextLine();
        System.out.println(pan1.matches("[A-Z]{5}[0-9]{4}[A-Z]"));        
    }
}
