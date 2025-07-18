/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methodss;

/**
 *
 * @author Student
 */
class gp{
    public void show(){
        System.out.println("z");
    }
}
class parent extends gp{
    public void show(){
        super.show();
        System.out.println("A");
    }
}
class Child extends parent{
    public void show(){
        super.show();
        System.out.println("p");
    }
}
public class testinheriatanceshow {
    public static void main(String args[]){
        Child c=new Child();
        c.show();
    }    
}
//super.super.show() is invalid in java