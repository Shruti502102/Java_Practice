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
public class tree_set_methods {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean exit=false;
        int choice=-1;
        TreeSet<String>names=new TreeSet<String>();
        System.out.println("Default size of TreeSet : "+names.size());
        while(!exit){
            System.out.println("1.add a name \n"+
                    "2.Remove a name \n"+
                    "3.search for a name \n"+
                    "4.Remove all names\n"+
                    "5.Is the set empty\n"+
                    "6.Exit");
            System.out.println("Enter your choice: ");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter a name: ");
                    names.add(sc.next());
                    System.out.println(names);
                    break;
                case 2:
                    System.out.print("Enter a name: ");
                    names.remove(sc.next());
                    System.out.println(names);
                    break;
                case 3:
                    System.out.print("Enter a name: ");
                    System.out.println(names.contains(sc.next()));
                    System.out.println(names);
                case 4:
                    names.clear();
                    System.out.println(names);
                    break;
                case 5:
                    System.out.println(names.isEmpty());
                    System.out.println(names);
                    break;
                case 6:
                    exit=true;
                    System.out.println("You exited wamnna visit again then call me again!");
                    break;
                default:
                    System.out.println("No choice please enter correct choice! o*w*o");       
            }
     
        }
    } 
    
}
