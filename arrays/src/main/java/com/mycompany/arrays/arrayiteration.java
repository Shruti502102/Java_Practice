/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

/**
 *
 * @author Student
 */
import java.util.*;
public class arrayiteration {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] arr={10,20,30};
        System.out.println("For Loop:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       
        System.out.println("\nFor-each loop: ");
        for(int val: arr){
            System.out.print(val+" ");
        }
    }    
}
