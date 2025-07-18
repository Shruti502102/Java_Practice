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
//emplicit=available ads  afunction map.entry running all keys we can read all values in the map keySE already a funcleion 2 diff methgod for trversing through the hash map
public class hashmap_put_notordered_get_containsetcmethods {
    public static void main(String args[]){
        HashMap<Integer, String> map=new HashMap<>();
        //Adding 10 key-value pairs
        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Mango");
        map.put(4,"Grapes");
        map.put(5,"Cherry");
        map.put(6, "Date");
        map.put(7, "Blueberry");
        map.put(8, "Fig");
        map.put(9, "WaterMelon");
        map.put(10,"Litchi" );
        //get()
        System.out.println("Get value with key 5: "+map.get(5));
        //containsKey() and containsValue()
        System.out.println("Contains key : "+map.containsKey(7));
        System.out.println("Contains Value 'Date' ? : "+map.containsValue("Date"));
        //remove
        map.remove(3);
        //size()
        System.out.println("Size of HashMap : "+map.size());
        //isEmpty
        System.out.println("Is HashMap empty? : "+map.isEmpty());
        //Print using entrySet()
        System.out.println("\nPrinting using entrySet : ");
        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
        //Print using keySet()
        System.out.println("\nPrinting using keySet : ");
        for(Integer key : map.keySet()){
            System.out.println(key+"->"+map.get(key));
        }          
    }    
}
