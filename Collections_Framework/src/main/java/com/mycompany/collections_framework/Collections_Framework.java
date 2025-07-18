/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.collections_framework;

/**
 *
 * @author Student
 */
import java.util.*;
public class Collections_Framework {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //allocate and initialize array
        int array[]=new int[10];
        for(int i=0;i<10;i++){
            array[i]=-3*i;
        }
        //display, sort array    
        System.out.println("Original contents: ");
        display(array);
        System.out.println(array);
        Arrays.sort(array);
        System.out.print("Sorted: ");
        System.out.println(Arrays.toString(array));
        display(array);
        //fill and dispaly array
        Arrays.fill(array,2,6,-1);
        System.out.println("After fill(): ");
        display(array);
        //sort and display the array
        Arrays.sort(array);
        System.out.println("After sorting again: ");
        display(array);
        //binary search for -9
        System.out.println("The Value -9 is at location : ");
        int index=Arrays.binarySearch(array,-9);
        System.out.println(index);
        //copyOf and copyofRange, equals
        int array1[]=Arrays.copyOf(array, array.length);
        int array3[]=Arrays.copyOf(array,6);
        int array2[]=Arrays.copyOfRange(array,3,6);
        display(array1);
        display(array2);
        display(array3);
        System.out.println(Arrays.equals(array, array1));
        System.out.println(Arrays.equals(array,array2));
        System.out.println(Arrays.equals(array,array3));
        //Sorting Array in descending order
        Integer[] arr = { -3, 14, 0, 20, 3, 15 };
        /*
         System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Declare Integer[] so we can sort in descending order
        Integer[] userArray = new Integer[n];

        // Take input from user
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            userArray[i] = sc.nextInt();
        }

        */
        Arrays.sort(arr,Collections.reverseOrder());//does not work with p
        for(int i: arr){
            System.out.println(i+" ");
        }
    }
    static void display(int array[]){
        for(int i:array){
            System.out.println(i+" ");
        }
        System.out.println();   
    }
} 
