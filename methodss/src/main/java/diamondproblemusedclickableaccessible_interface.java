/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
interface Clickable{
    default void click(){
        System.out.println("click");
    }
    default void print(){
        System.out.println("clickable");
    }
}
interface Accessible{
    default void access(){
        System.out.println("access");
    }
    default void print(){
        System.out.println("accessable");
    }
}
public class diamondproblemusedclickableaccessible_interface implements Clickable, Accessible {
    public static void main(String args[]){
        public void print() {
            Clickable.super.print();   
            Accessible.super.print();
        }
        
    } 

 DiamondProblemUsedClickableAccessible_Interface obj = new DiamondProblemUsedClickableAccessible_Interface();
}
