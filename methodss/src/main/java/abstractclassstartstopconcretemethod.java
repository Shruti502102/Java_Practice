/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
abstract class Vehicle{//abstract class
    abstract void start();//abstract method
    abstract void stop();//abstract method
    
}
class Motorbike extends Vehicle{
    void start(){
        System.out.println("Motorbike started");
    }
    void stop(){
        System.out.println("Motorbike stoped.");
    }
}

class Truck extends Vehicle{
    void start(){
        System.out.println("Truck started");
    }
    void stop(){
        System.out.println("Truck stoped.");
    }    
}
public class abstractclassstartstopconcretemethod {
    public static void main(String args[]){
        Vehicle ve;//reference variable of abstract class
        ve=new Motorbike();//assigning a concrete class object
        ve.start();
        ve.stop();
        Vehicle v2=new Motorbike();
        Vehicle v1=new Truck();
        ve=new Truck();
        ve.start();
        ve.stop();    
    } 
}
