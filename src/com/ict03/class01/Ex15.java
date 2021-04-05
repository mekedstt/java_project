package com.ict03.class01;

public class Ex15 {
	int s1 = 100;
	static int s2 = 200;
	
	static {
		s2 = 2000;
		
	}
	static int s3 = 2000;
	static int s4 = 2000;
	
	public static void main(String[] args) {
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
