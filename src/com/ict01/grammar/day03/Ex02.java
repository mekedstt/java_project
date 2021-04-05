package com.ict01.grammar.day03;

class Ex02 {

	public static void main(String[] args) {
	
	int s1 = 10, s2 = 7;
	boolean result = false || false;
	System.out.println(result);
	
	result = (s1 >= 15) || (s2 <=5);
	System.out.println(result);	
	
	result = true && false;
	System.out.println(result);
	
	result = (s1 >= 15) || (s2 >=5);
	System.out.println(result);	
	
	/*result = (s1 = s1 + 2) > 20)) || (s1 = (s2 = s2 + 5));
	System.out.println(result);
	System.out.println(s1);	
	System.out.println(rs2);*/	
		
	
	result  = true;
	System.out.println(!result);
	System.out.println(!!result);	
	System.out.println(!!!result);	
	
	
	
	
	
	
	
	
	
	
	
	}
}