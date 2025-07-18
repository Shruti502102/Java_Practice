/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
class A{
    final void math(){
        System.out.println("This is a final method.");
    }
}
//the following class decleraation is illegal
class B extends A{
    void math(){
       System.out.println("Illegal");
    }
 }
//a method declared final cannot be overriden but it can be overloaded
}
public class preventingmethodoverridingwithfinal {
    public static void main(String args[]){
        A a=new A();
        B b=new B();
        B b;     
        System.out.println(a.math());
        
    }  
}
