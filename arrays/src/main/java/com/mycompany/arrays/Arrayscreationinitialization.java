/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arrays;

/**
 *
 * @author Student
 */
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
public class Arrayscreationinitialization {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];//dynamic default 0
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        int[] primes={2, 3, 5, 7};//static       
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(primes));
    }
}
