/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrays;

/**
 *
 * @author Student
 */
import java.util.*;
public class rowcolmatrix {
    public static void main(String args[]){
        int[][] matrix={{1,2,3},{4,5,6}};
        System.out.println("Nested for loop: ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){               
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Nested for-each loop: ");
        for(int[] row:matrix){
            for(int val:row){
                System.out.print(val+" ");
            }
            System.out.println();
        }   
    }    
}
