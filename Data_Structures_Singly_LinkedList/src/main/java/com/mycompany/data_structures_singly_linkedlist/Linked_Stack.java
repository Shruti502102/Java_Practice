/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.data_structures_singly_linkedlist;

/**
 *
 * @author Student
 */
class Linked_Stack {
    class Node{
        int data;
        Node next;
        Node(int value){
            data=value;
            next=null;
        }
    }
    Node top;
    void push(int value){
        Node newNode=new Node(value);
        newNode.next=top;
        top=newNode;
    }
    int pop(){
        if (top==null) return -1;
        int value=top.data;
        top=top.next;
        return top.data;
    }
    int peek(){
        if(top==null)return-1;
        return top.data;
    }
    boolean isEmpty(){
        return top==null;
    }
    void display(){
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        Linked_Stack ls=new Linked_Stack();
        ls.push(10);
        ls.push(32);
        ls.push(43);
        ls.push(2);
        ls.display();
        ls.pop();
        ls.display();
        System.out.println("Top Elements : "+ls.peek());
    }
}
