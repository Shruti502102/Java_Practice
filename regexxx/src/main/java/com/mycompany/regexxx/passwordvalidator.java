/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.regexxx;

/**
 *
 * @author Student
 */
import java.util.*;
public class passwordvalidator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String password=sc.nextLine();
        boolean valid=password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+-]).{8,}$");
        System.out.println(valid);
    }   
}
 