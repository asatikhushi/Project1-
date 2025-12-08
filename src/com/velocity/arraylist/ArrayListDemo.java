package com.velocity.arraylist;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[]args) {
		ArrayList<Integer> list=new ArrayList();
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
	
		for(Integer num:list) {
			System.out.println(num);
		}
		
	}

}
