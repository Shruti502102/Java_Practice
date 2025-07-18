/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collections_framework;

/**
 *
 * @author Student
 */
import java.util.*;
public class Array_List {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean exit=false;
        int choice=-1;
        ArrayList<Integer> marks=new ArrayList<Integer>();
        System.out.println("Initial size of ArrayList: ");
        while(!exit){
            System.out.println("1.Add Marks. \n2.Remove Marks. \n3.Retrieve Marks. \n4.Exit.");
            System.out.print("Enter you choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter a mark: ");
                    marks.add(sc.nextInt());
                    System.out.println(marks);
                    break;
                case 2:
                    System.out.print("Enter an index: ");
                    marks.remove(sc.nextInt());
                    System.out.println(marks);
                    break;
                case 3:
                    System.out.println("Enter an index: ");
                    System.out.println(marks.get(sc.nextInt()));
                    System.out.println(marks);
                    break;
                case 4:
                    System.exit(0);
                    exit=true;
                    break;
                default:
                    System.out.println("Enter correct input please! >#~#< ");
            
            }
        }
    } 
}
