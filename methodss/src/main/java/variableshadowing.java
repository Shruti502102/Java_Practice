/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
class Parent{
    int a=10;
    public void show(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    int a=20;
    public void show(){
        System.out.println("a");//Variable Shadowing
        System.out.println(super.a);
    }
}
public class variableshadowing {
    public static void main(String args[]){
        Parent p=new Parent();
        System.out.println(p.a);
        p.a=40;
        System.out.println(p.a);
        p.show();
        p=new Child();
        System.out.println(p.a);//displays 10, does not woirk like
        p.show();
        Child c=new Child();
        System.out.println(c.a);
        c.show();
    }  
}
