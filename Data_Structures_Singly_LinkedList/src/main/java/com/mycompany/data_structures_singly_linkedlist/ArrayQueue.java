/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.data_structures_singly_linkedlist;

/**
 *
 * @author Student
 */
class ArrayQueue {
    int front, rear, capacity;
    int[] queue;
    ArrayQueue(int size){
        capacity=size;
        queue=new int[capacity];
        front=rear=0;
    }
    void enqueue(int item){
        if(rear==capacity)return;
        queue[rear++]=item;
    }
    int dequeue(){
        if(front==rear) return -1;
        int item=queue[front++];
        if(front==rear)front=rear=0;
        return item;
    }
    void display(){
        for(int i=front;i<rear;i++)
            System.out.print(queue[i]+" ");
        System.out.println();
    }
    public static void main(String args[]){
        ArrayQueue q=new ArrayQueue(5);
        q.enqueue(10);
        q.enqueue(40);
        q.enqueue(920);
        q.enqueue(540);
        q.enqueue(230);
        q.display();
        q.dequeue();
        q.display();
    }
}
