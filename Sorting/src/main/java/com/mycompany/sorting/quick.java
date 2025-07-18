/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sorting;

/**
 *
 * @author Student
 */
import java.util.*;
public class quick {
    public static void quicksort(int[] arr,int low,int high){ 
        if(low<high){
            int pi=partition(arr,low,high);
            quicksort(arr,low,pi-1);
            quicksort(arr,pi+1,high);
        }
    }   
    public static int partition(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low+1;
        int j=high;
        while(i<=j){
            while(i<=high &&arr[i]<=pivot)
                i++;
            while(arr[j]>pivot){
                j--;

            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }                         
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter elements of an array.");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quicksort(arr,0,n-1);
        System.out.println("Sorted Array: ");
        for(int num:arr){
            System.out.println(num+" ");
        }
    }
}
