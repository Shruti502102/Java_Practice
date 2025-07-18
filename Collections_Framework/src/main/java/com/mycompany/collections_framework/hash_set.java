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
public class hash_set {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean exit=false;
        int choice=-1;
        HashSet<String> names=new HashSet<String>();
        System.out.println("Default size of HashSet : "+names.size());
        while(!exit){
            System.out.println("1.add a name\n"
            +"2.remove an element\n"+"3.search for a name\n"+"4.remove all names\n"+"5.is the set empty?\n"+"6.Exit");
            System.out.print("Enter your choice: ");
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
                    break;
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
                    break;
                default:
                    System.out.println("Enter corrected input or retry again till you get it right! >*~*<");
                            
            }
        }
    }
}
