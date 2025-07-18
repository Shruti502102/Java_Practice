/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
//figure java
class figure{
    protected double dim1;
    protected double dim2;
    public figure(double a,double b){
        dim1=a;
        dim2=b;
    }
    public double area()
    {
        System.out.println("Area for Figure is undefined.");
        return 0;
    }
}
class rectangle extends figure{
    public rectangle(double a,double b){
        super(a,b);
    }
    public double area(){
        System.out.println("Inside Area for Rectangle.");
        return dim1*dim2;
    }  
//override area for rectangle
}
class triangle extends figure{
    public triangle(double a,double b){
        super(a,b);
    }
    public double area(){//override area for right triangle
        System.out.println("Inside Area for triangle.");
        return (dim1*dim2/2);
    }
}
public class methodoverridingruntimepolymorphismdynamicmethoddispatch {
    public static void main(String args[]){
        figure f=new figure(10,0);
        rectangle r=new rectangle(20,32);
        triangle t=new triangle(10,30);
        figure fig;
        fig=f;
        System.out.println(fig.area()+"");
        fig=r;
        System.out.println(fig.area()+" ");
        fig=t;
        System.out.println(fig.area());
        
    }   
}
