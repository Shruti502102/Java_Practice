/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loop;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class forrr {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int fact=1;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            fact=fact*i;
            System.out.println(fact);
        }
    }
}
