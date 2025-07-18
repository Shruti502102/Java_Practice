/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collections_framework;

/**
 *
 * @author Student
 */
/* demonstratye the use of comparator for sorting in user-defined order*/
import java.util.*;
//compare last whole words in 2 strings
class TOComp implements Comparator<String>{
    public int compare(String a, String b){
        int i,j,k;
        String aStr,bStr;
        aStr=a;
        bStr=b;
        //find index of beginning of last name.
        i=aStr.lastIndexOf(' ');
        j=bStr.lastIndexOf(' ');
        k=aStr.substring(i).compareTo(b.strip().substring(j));
        if (k==0){//last name maTCH, CHECK Entire name
            return aStr.compareTo(bStr);
        }
        else 
            return k;      
    }
}
public class Treeset_comparator {
    public static void main(String args[]){
        //create a tree map
        TreeMap<String, Double> tm=new TreeMap<String, Double>(new TOComp());
        //put elements in map
        tm.put("Shruti Srivastava", new Double(436.324));
        tm.put("Shruti Pandey", new Double(436.325));
        tm.put("Shruti Rathore", new Double(46.326));
        tm.put("Shruti Singh", new Double(436.327));
        tm.put("Shruti Sharma", new Double(-436.328));
        //get a set of entities
        Set<Map.Entry<String, Double>> set=tm.entrySet();
        //display the elements.
        for(Map.Entry<String, Double> me : set){
            System.out.print(me.getKey()+" : ");
            System.out.println(me.getValue());
        }
        System.out.println();
        //deposit 1000 into Shruti Srivastava's Account
        double balance=tm.get("Shruti Srivastava");
        tm.put("Shruti Srivastava",balance+1000);
        System.out.println("Shruti Srivastava's new Balance : "+tm.get("Shruti Srivastava"));      
    }   
}
