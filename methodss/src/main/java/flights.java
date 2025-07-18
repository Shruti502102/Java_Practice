/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
interface flyable{
    void fly();
}
class Aeroplane implements flyable{
    public void fly(){
        System.out.println("Aeroplane is flying.");
    }
}
class Bird implements flyable{
    public void fly(){
        System.out.println("Bird is flying.");
    }
}
public class flights {
    public static void main(String arags[]){
        flyable flyy=new Bird();
        flyy.fly();
        flyy=new Aeroplane();
        flyy.fly();
    }   
}
