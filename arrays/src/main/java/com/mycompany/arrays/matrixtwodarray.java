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
public class matrixtwodarray {
    public static void main(String args[]){
        int[][] matrix={{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(matrix));
        System.out.println("Row by row: ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
