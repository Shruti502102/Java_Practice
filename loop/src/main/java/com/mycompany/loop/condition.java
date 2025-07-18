/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loop;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class condition {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in); 
        int counter=sc.nextInt();
        int i=0;
        do{
            System.out.println(i);
            ++i; 
        }
        while(i<counter);      
    }   
}
