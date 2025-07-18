/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.data_structures_singly_linkedlist;

/**
 *
 * @author Student
 */
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedQueue {
    Node front,rear;
    void enqueue(int item){
        Node newNode=new Node(item);
        if(rear==null){
            front=rear=newNode;
        }
        else{
            rear.next=newNode;
            rear=newNode;           
        }       
    }
    int deqeue(){
        if(front==null)return -1;
        int val=front.data;
        front=front.next;
        if(front==null) rear=null;
        return val;
    }
    void display(){
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        LinkedQueue q=new LinkedQueue();
        q.enqueue(21);
        q.enqueue(2);
        q.enqueue(20);
        q.enqueue(27);
        q.enqueue(25675766);
        q.display();
        q.deqeue();
        q.display();
    }
}
