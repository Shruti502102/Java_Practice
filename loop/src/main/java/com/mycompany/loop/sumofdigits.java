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
public class sumofdigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int s=0;
        while(a!=0){
            s=s+a%10;//taken last to calculate
            a=a/10;//remove last
        }
        System.out.println(s);       
    }
}
