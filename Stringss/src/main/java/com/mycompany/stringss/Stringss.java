/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.stringss;

/**
 *
 * @author Student
 */
public class Stringss {
    public static void main(String[] args) {
        String s=new String("wello");
        System.out.println(s);
        String str1="Hello";//string literal
        System.out.println(str1.length());
        String str2="Java";
        System.out.println(str2.charAt(2));
        String str3="Programming";
        System.out.println(str3.substring(1,6));
        String str4="Hello World";
        System.out.println(str4.toLowerCase());
        System.out.println(str4.toUpperCase());
        String s1="Haha";
        String s2="haha";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        String a="apple";
        String b="banana";
        System.out.println(a.compareTo(b));
        String s3="    Hello World     ";
        System.out.println(s3.trim());
        String s5="banananana";
        System.out.println(a.substring(0,1).toUpperCase()+""+a.substring(1));
        System.out.println(s5.replace('a','o'));
        System.out.println(s5.replaceAll("na","6475dsnhsdbf"));
    }
}
