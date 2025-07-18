/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
abstract class Bank
{
    abstract int getRateOfInterest();
}
class SBI extends Bank
{
    int getRateOfInterest(){
        return 7;
    }
}
class ICICI extends Bank{
    int getRateOfInterest(){
        return 8;
    }
}
class abstractclassoverriden {
    public static void main(String args[]){
        Bank b;
        b=new SBI();
        Bank b1=new SBI();
        Bank b2=new ICICI();
        System.out.println(b1);
        System.out.println("Rate of Interest is : "+b.getRateOfInterest());
        b=new ICICI();
        System.out.println(b2);
        System.out.println("Rate of Interest is : "+b.getRateOfInterest());        
    }
}