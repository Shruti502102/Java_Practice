/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dynamic_programming;

/**
 *
 * @author Student
 */
import java.util.*;
public class lcs_longest_common_subsequence {
    public static String findlcs(String s1,String s2){
        int m=s1.length(),n=s2.length();
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0||j==0)
                    dp[i][j]=0;
                else if(s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j]=1+dp[i-1][j-1];
                else
                    dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        int i=m,j=n;
        StringBuilder lcs=new StringBuilder();
        while(i>0&&j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                lcs.append(s1.charAt(i-1));
                i--;
                j--;
                
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                i--;
            }
            else{
                j--;
            }
           
        }
        return lcs.reverse().toString();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first String : ");
        String s1=sc.next();
        System.out.println("Enter Second String : ");
        String s2=sc.next();
        String lcs=findlcs(s1,s2);
        System.out.println("Length of LCS: "+lcs.length());
        System.out.println("LCS: "+lcs);
    }
}
