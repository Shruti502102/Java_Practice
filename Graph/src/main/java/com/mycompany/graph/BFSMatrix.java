/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graph;

/**
 *
 * @author Student
 */
import java.util.*;
public class BFSMatrix {
    int vertices;
    int[][] matrix;
    BFSMatrix(int v){
        vertices=v;
        matrix=new int[v][v];
    }
    void addEdgesBFS(int src,int dest){
        matrix[src][dest]=1;
    }
    void startBFS(int start){
        boolean[] visited=new boolean[vertices];
        Queue<Integer> queue=new LinkedList<>();
        visited[start]=true;
        queue.add(start);
        while(!queue.isEmpty()){
            int node=queue.poll();
            System.out.print(node+" ");
            for(int i=0;i<vertices;i++){
                if(matrix[node][i]==1 && !visited[i]){
                    visited[i]=true;
                    queue.add(i);
                }
            }
        }
    }
    public static void main(String args[]){
        BFSMatrix g=new BFSMatrix(6);
        g.addEdgesBFS(0, 1);
        g.addEdgesBFS(0, 2);
        g.addEdgesBFS(1, 3);
        g.addEdgesBFS(2, 4);
        g.addEdgesBFS(3, 5);
        g.addEdgesBFS(1, 5);
        g.startBFS(0);
    }   
}
