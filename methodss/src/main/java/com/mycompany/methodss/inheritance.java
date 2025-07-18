/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methodss;

/**
 *
 * @author Student
 */
class parent{
    private int a;
    public parent()
    {
        this.a=10;
        
    }
    public int geta(){
        return a;
    }
}
class child extends parent{
    private int b;
    public child(){
        this.b=20;
    }
    public int getb(){
        return b;
    }
    
}
public class inheritance {
    public static void main(String args[]){
        child c=new child();
        System.out.println(c.geta()+" "+c.getb());
        System.out.println(c.getb());
    }
}
