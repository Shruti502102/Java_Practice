/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.data_structures_singly_linkedlist;

/**
 *
 * @author Student
 */
public class Data_Structures_Singly_LinkedList {
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    Node head;
    void insertAtBegin(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=newNode;   
        
        //head=newNode;
    }
    void insertAtPosition(int data,int pos){
        if(pos==1){
            insertAtBegin(data);
            return;
        }
        Node newNode=new Node(data);
        Node temp=head;
        for(int i=1; i<pos-1 && temp != null; i++){
            temp=temp.next;
        }
        if(temp == null)
            return;
        newNode.next=temp.next;
        temp.next=newNode;
    }
    void deleteAtBegin(){
        if(head==null)
            return;
        head=head.next;
    }
    void deleteAtEnd(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        
    }
    void deleteAtPosition(int pos){
        if(head==null)
            return;
        if(pos==1){
            deleteAtBegin();
            return;
        }
        Node temp=head;
        for(int i=1;i<pos-1 && temp.next!=null; i++){
            temp=temp.next;
        if(temp.next==null)
            return;
        }
        temp.next=temp.next.next;
        
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Data_Structures_Singly_LinkedList a=new Data_Structures_Singly_LinkedList();
        a.insertAtBegin(10);
        a.insertAtEnd(20);
        a.insertAtPosition(15,2);
        a.insertAtPosition(34324,3);
        a.insertAtEnd(121);
        a.display();
        a.deleteAtBegin();
        a.display();
        a.deleteAtEnd();
        a.display();
        a.deleteAtPosition(2);
        a.display();
        
    }
}
