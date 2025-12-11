package com.velocity.arraylist;
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int num1[]  =new int[4] ;
     int num2[]  =new int[4] ;
     int result[]  =new int[4] ;

     System.out.println("Enter integer value ");
     for(int i=0;i<num1.length;i++){
        num1[i]=sc.nextInt();
     }

     System.out.println("Enter integer value");
     for(int i=0;i<num1.length;i++){
        num2[i]=sc.nextInt();
     }
     sc.close();
     System.out.println("print sum of two integer value which is enter by user :");
     for(int i=0;i<num1.length;i++){
       result[i] =num1[i]+num2[i];
         System.out.println(result[i]);
     }
    }
}
