/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
abstract class Animal{
    String name;
    public Animal(String name){
        this.name=name;
        System.out.println("Animal constructor called for : "+name);
    }
    public abstract void sound();
    public void sleep(){
        System.out.println(name+" is sleeping.....");
    }
}
class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
   public void sound(){
       System.out.println(name+" says: Woof Woof! +v+");
   } 
}
public class animalabstract {
    public static void main(String args[]){
        Dog dog=new Dog("Lucy");
        dog.sound();
        dog.sleep();
    } 
}
