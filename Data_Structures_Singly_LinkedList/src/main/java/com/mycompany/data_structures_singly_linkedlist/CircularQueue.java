/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.data_structures_singly_linkedlist;

/**
 *
 * @author Student
 */
class CircularQueue{
    int[] queue;
    int front,rear,size,capacity;
    CircularQueue(int capacity){
        this.capacity=capacity;
        queue=new int[capacity];
        front=rear=size=0;    
    }
    void enqueue(int item){
        if(size==capacity) return;
        queue[rear]=item;
        rear=(rear+1)%capacity;
        size++;
    }
    int dequeue(){
        if(size==0)return -1;
        int item=queue[front];
        front=(front+1)%capacity;
        size--;
        return item;
        
    }
    void display(){
        if(size==0){
            System.out.println();
            return;
        }
        int i=front;
        for(int count=0;count<size;count++){
            System.out.print(queue[i]+" ");
            i=(i+1)%capacity;
        }
        System.out.println();
    }
    public static void main(String args[]){
        CircularQueue q=new CircularQueue(5);
        q.enqueue(132);
        q.enqueue(12);
        q.enqueue(32);
        q.enqueue(13);
        q.display();
        q.dequeue();
        q.display(); 
    }
}
