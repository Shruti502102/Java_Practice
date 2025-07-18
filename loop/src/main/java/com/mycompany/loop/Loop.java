/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.loop;

/**
 *
 * @author Student
 */
import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int counter=sc.nextInt();
        int i=0;
        while(i<counter){
            if(i==5){
                i++;
                break;
                
            }
            System.out.println(i);
            ++i;
        }
    }
}
