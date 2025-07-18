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
public class linked_list {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean exit=false;
        int choice=-1;
        LinkedList<Double> marks=new LinkedList<Double>();
        System.out.println("Default size of the linkedlist : "+marks.size());
        while(!exit){
            try{
                System.out.println("1. Add marks at the beginning. \n2. Add marks at the end. \n3. Retrieve marks. \n"
                        + "4. Remove marks\n5.Remove marks from the beginning..\n6. Remove marks of the end\n7. Exit.");
                System.out.println("Enter your choice: ");
                switch(choice){
                    case 1:
                        System.out.print("Enter a mark : ");
                        marks.addFirst(sc.nextDouble());
                        System.out.println(marks);
                        break;
                    case 2:
                        System.out.print("Enter a mark : ");
                        marks.addLast(sc.nextDouble());
                        System.out.println(marks);
                        break;
                    case 3:
                        System.out.print("Enter an index: ");
                        System.out.println(marks.get(sc.nextInt()));
                        System.out.println(marks);
                        break;
                    case 4:
                        System.out.print("Enter an index: ");
                        int removeIndex = sc.nextInt();
                        if (removeIndex >= 0 && removeIndex < marks.size()) {
                            marks.remove(removeIndex);
                            System.out.println("Updated list: " + marks);
                        } else {
                            System.out.println("Invalid index!");
                        }
                        break;

                    case 5:
                        if (!marks.isEmpty()) {
                            marks.removeFirst();
                            System.out.println("First mark removed. Updated list: " + marks);
                        } else {
                            System.out.println("List is empty.");
                        }
                        break;

                    case 6:
                        if (!marks.isEmpty()) {
                            marks.removeLast();
                            System.out.println("Last mark removed. Updated list: " + marks);
                        } else {
                            System.out.println("List is empty.");
                        }
                        break;

                    case 7:
                        System.out.println("Exiting program. Goodbye!");
                        exit = true;
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input type! Please enter numbers only.");
                sc.nextLine(); // clear invalid input
            }
        }   
    }   
}