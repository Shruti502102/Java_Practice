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
//O(n) complexity more than hashmap
public class Treemap_keyvalue_pairing_more_tc_then_hash {
    public static void main(String args[]){
        TreeMap<Integer, String> map=new TreeMap<>();
        //adding 10 key-value pairs
        map.put(25, "Lion");
        map.put(10,"Tiger");
        map.put(15,"Elephant");
        map.put(5,"Giraffe");
        map.put(10,"Zebra");
        map.put(20,"Monkey");
        map.put(30,"Bear");







        map.put(30,"Panda");
        map.put(35, "Deer");
        map.put(40, "Eagle");
        //get()
        System.out.println("Get value with key is: "+map.get(15));
        //containsKey() and containsValue()
        System.out.println("Contains key : "+map.containsKey(5));
        System.out.println("Contains Value 'Date' ? : "+map.containsValue("Zebra"));
        //remove
        map.remove(10);
        //size()
        System.out.println("Size of HashMap : "+map.size());
        //isEmpty
        System.out.println("Is HashMap empty? : "+map.isEmpty());
        //firstKey and lastkey
        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: "+map.lastKey());
        // firstEntry and lastEntry
        System.out.println("First Entry: " + map.firstEntry());
        System.out.println("Last Entry: " + map.lastEntry());
        //hgherKey and lowerKey
        System.out.println("Key higher than 25: " + map.higherKey(25));
        System.out.println("Key lower than 25: " + map.lowerKey(25));
        // replace value
        map.replace(20, "Monkey", "Chimpanzee");
        System.out.println("Updated value for key 20: " + map.get(20));
        //Print using entrySet()
        System.out.println("\nPrinting using entrySet : ");
        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
        //Print using keySet()
        System.out.println("\nPrinting using keySet : ");
        for(Integer key : map.keySet()){
            System.out.println(key+"->"+map.get(key) +" "+key  + "");
        }
    }    
}
