/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loop;

/**
 *
 * @author Student
 */
import java.util.*;
public class factorial_while {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int fact=1;
        int i=1;
        int a=sc.nextInt();
        while(a>=i){
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of "+a+" is "+fact);    
    } 
}
