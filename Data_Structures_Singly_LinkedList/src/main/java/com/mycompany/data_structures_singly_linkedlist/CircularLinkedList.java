/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.data_structures_singly_linkedlist;

/**
 *
 * @author Student
 */
class CircularLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    Node last;
    void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(last==null){
            last=newNode;
            last.next=last;  
        }
        else{
            newNode.next=last.next;
            last.next=newNode;
            last=newNode;
        }
    }
    void insertAtBeginning(int data){
        Node newNode=new Node(data);
        if(last==null){
           last=newNode;
           last.next=last;
        }
        else{
            newNode.next=last.next;
            last.next=newNode;
        }    
    }
    void deleteNode(int key){
        if(last==null) return;
        Node curr=last.next;
        Node prev=last;
        while(curr !=last){
            if(curr.data==key){
                prev.next=curr.next;
                return;
            }
            prev=curr;
            curr=curr.next; 
        }
        if(curr.data==key){
            if(curr==last && curr.next==last){
                last=null;
            }
            else{
                prev.next=curr.next;
                last=prev;
            }
        }
    }
    void display(){
        if(last==null) return;
        Node curr=last.next;
        while(curr!=last){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println(curr.data);
    }
    public static void main(String args[]){
        CircularLinkedList c=new CircularLinkedList();
        c.insertAtEnd(10);
        c.insertAtEnd(20);
        c.insertAtEnd(30);
        c.display();
        c.insertAtBeginning(5);
        c.display();
        c.deleteNode(5);
        c.display();
    }
}
