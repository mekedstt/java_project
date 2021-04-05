package com.ict03.class01;

public class Ex05 {
	public int s1 = 10;
	private int s2 = 20;
	public static int s3 = 30;
	private static int s4 = 40;
	
	
	public void add() {
		s1 += 10;
		s2 += 10;
		s3 += 10;
		s4 += 10;
	}
	
	private void add2() {
		s1 += 10;
		s2 += 10;
		s3 += 10;
		s4 += 10;
	}
	
	
	void add3() {
		add2();
	}
	
}
