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
public class arrayaccess {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=1;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(arr[2]);
        arr[2]=99;
        System.out.println(arr[2]);
    }  
}
