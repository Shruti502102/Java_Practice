/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

/**
 *
 * @author Student
 */
import java.util.Scanner;
import java.util.Arrays;
public class arrayuserinput {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter 5 integers: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("You entered: "+Arrays.toString(arr));
        sc.close();
    }   
}
