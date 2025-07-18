/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.methodss;

/**
 *
 * @author Student
 */
//method overloading
class Methods {
    public int add(int x,int y){
        return (x+y);
    }
    public int add(int x,int y,int z){
        return (x+y+z);
    }
    public double add(double x,double y){
        System.out.println("both double:");
        return (x+y);
    }
    public double add(int x,double y){
        System.out.println("int followed by double:");
        return (x+y);
    }
    public double add(double x,int y){
        System.out.println("double followed by int:");
        return (x+y);
    }
    public byte add(byte x,byte y){
        System.out.println("double followed by int:");
        return ((byte)(x+y));
    }
}
public class Methodss{
    public static void main(String[] args) {
        Methods s=new Methods();
        System.out.println(s.add(10,20));
        System.out.println(s.add(10,20,30));
        System.out.println(s.add(10.5,20.5));  
        System.out.println(s.add((byte)10,(byte)20));
        System.out.println(s.add('A',20.5));//type conversion
        System.out.println(s.add(10.5f,29.5f));//type conversion
        System.out.println(s.add(9.5,20));
        System.out.println(s.add(10,20.5));
    }
}
