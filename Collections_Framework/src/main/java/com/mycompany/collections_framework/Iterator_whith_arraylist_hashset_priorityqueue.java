/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collections_framework;

/**
 *
 * @author Student
 */
import java.util.*;
public class Iterator_whith_arraylist_hashset_priorityqueue {
    public static void main(String args[]){
        //ArrayList
        ArrayList<String> list=new ArrayList<>(Arrays.asList("Apple","Banana","Grapes","Litchi","Mango","Melon"));
        Iterator<String> itr1=list.iterator();
        while(itr1.hasNext()){
            System.out.println("ArrayList: "+itr1.next());
        }
        // HashSet
        HashSet<Integer> set=new HashSet<>(Arrays.asList(10,20,30,40,50,60));
        Iterator<Integer> itr2=set.iterator();
        while(itr2.hasNext()){
            System.out.println("HashSet: "+itr2.next());
        }
        //Priority Queue
        PriorityQueue<Double> queue=new PriorityQueue<>();
        queue.add(1.1);
        queue.add(2.2);
        queue.add(3.3);
        queue.add(4.4);
        queue.add(5.5);
        queue.add(6.6);
        Iterator<Double> itr3=queue.iterator();
        while(itr3.hasNext()){
            System.out.println("PriorityQueue: "+itr3.next());
        }
    }   
}
