/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.relational;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class ifcondition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>90){
            System.out.println("Grade A");
        }
        else if(marks<=90 && marks>=80 ){
            System.out.println("Grade B");
        }
        else{
            System.out.println("Fail");
        }
    }
    
}
