/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dynamic_programming;

/**
 *
 * @author Student
 */
import java.util.*;
public class Dynamic_Programming {//FibonacciSeriesDp
    static int[] fibSeries(int n){
        int[] dp=new int[n+1];
        if(n>=1)
            dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp;
    }
    public static void main(String[] args) {
        int n=10;
        int[] result=fibSeries(n);
        for(int i=0;i<=n;i++){
            System.out.println(result[i]+"   ,.^.,   ");
        }
    }
}
