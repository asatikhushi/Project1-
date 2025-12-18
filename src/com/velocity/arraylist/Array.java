package com.velocity.arraylist;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
    	System.out.println("Array code");
       Scanner sc=new Scanner(System.in);
     int num1[]  =new int[4] ; 
     int result[]  =new int[4] ;
     System.out.println("Enter integer value ");
     for(int i=0;i<num1.length;i++){
        num1[i]=sc.nextInt();
     }
      sc.close();

     System.out.println("print integer value which is enter by user :");
     for(int i=0;i<num1.length;i++){
       result[i] =num1[i];
         System.out.println(result[i]);
     }
    }     
}
