/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loop;

/**
 *
 * @author Student
 */
import java.util.*;
public class primeornot {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        if(a<=1){
            System.out.println("Not Prime");
        }
        else{
            for(int i=2;i<=a/2;i++){
                if(a%i==0){
                    c++;
                    break;//not prime even one time come after halfing out
                }
            }
            if(c==0){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");               
            }
        }
        
    }
}
