/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.relational;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class swit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch(choice){
            case 1:System.out.println("OPTION 1 SELECTED");
            break;
            case 2:System.out.println("OPTION 2 SELECTED");
            break;
            case 3:System.out.println("OPTION 3 SELECTED");
            break;
            default:System.out.println("INCORRECT OPTION  SELECTED");
        }        
    }    
}
