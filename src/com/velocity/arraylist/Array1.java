package com.velocity.arraylist;
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int num[]  =new int[4] ;

     System.out.println("Enter integer value");
     for(int i=0;i<num.length;i++){
        num[i]=sc.nextInt();
     }
     sc.close();

      System.out.println();
      System.out.println("print integer value which is enter by user :");
      for(int i=0;i<num.length;i++){
       System.out.println(num[i]) ;
     }
    }
}
