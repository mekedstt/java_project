package com.ict01.grammar.day02;

class Ex09{

	public static void main(String[] args) {
	
	
	int hour = 2, min = 40, sec = 23;

	min += 60 * hour;
	sec += 60 * min;
		
	System.out.println(sec);


	sec = 9630;

	min = sec / 60;
	sec = sec % 60;

	hour = min / 60;
	min = min % 60;
	
	System.out.println(hour + "시간 " + min + "분 " + sec + "초");
	
	
	}

}