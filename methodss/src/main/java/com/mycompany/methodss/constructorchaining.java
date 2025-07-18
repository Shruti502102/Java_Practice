/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methodss;

/**
 *
 * @author Student
 */
class employee{
    private String firstname;
    private String lastname;    
    public employee(){
        firstname="John";
        lastname="Doe";
    }
    public employee(String fname,String lastname){
        this.firstname=fname;
        this.lastname=lastname;
    }
    public employee(String fname){//default parameters are not directed
        this(fname,"ddoe");//Constructor Chaining
    }
    public String getfirstname(){
        return firstname;
    }
    public String getlastname(){
        return lastname;
    }
  
}
public class constructorchaining {
    public static void main(String args[]){
        employee e1=new employee();
        employee e2=new employee("James","Gosling");
        employee e3=new employee("James");
        System.out.println(e1.getfirstname()+" "+e1.getlastname());
        System.out.println(e2.getfirstname()+" "+e2.getlastname());
        System.out.println(e3.getfirstname()+" "+e3.getlastname());
        System.out.println("Name:"+e1.getfirstname()+" "+e1.getlastname());
        System.out.println(e1);
        System.out.println("Name:"+e2.getfirstname()+" "+e2.getlastname());        
        System.out.println(e2);
        System.out.println("Name:"+e3.getfirstname()+" "+e3.getlastname());        
        System.out.println(e3.toString());
        
    }    
}
