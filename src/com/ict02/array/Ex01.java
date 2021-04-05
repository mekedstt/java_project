package com.ict02.array;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] su = new int[5];
		
		su[0] = 123;
		su[1] = 'j';
		su[2] = 321;
		su[3] = 456;
		su[4] = 654;
		
		System.out.println(su);
		
		
		
		System.out.println(su[0]);
		System.out.println(su[1]);
		System.out.println(su[2]);
		System.out.println(su[3]);
		System.out.println(su[4]);
		
		
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
			
		}
		
		
		
	}

}
