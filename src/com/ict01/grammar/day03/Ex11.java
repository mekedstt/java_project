package com.ict01.grammar.day03;

class Ex11{
	public static void main(String[] args) {
		//int k1의 점수가 90 이상이면 A 80이상이면 B, 70이상이면 C 나머지는 F
		int k1 = 81;
		String res = "";
		if(k1 >= 90)
			res = "A";
		else if(k1 >= 80)
			res = "B";
		else if(k1 >= 70)
			res = "C";
		else
			res = "F";
		System.out.println("결과 : " + res);
		//char k2가 대문자인지 소문자인지 숫자인지 기타문자인지 판별
		char k2 = '*';
		if(k2 >= 'A' && k2 <= 'Z')
			res = "대문자";
		else if(k2 >= 'a' && k2 <= 'z')
			res = "소문자";
		else if(k2 >= '0' && k2 <= '9')
			res = "숫자";
		else 
			res = "기타문자";
		System.out.println("결과 : " + res);	
		

		char k3 = 'd';

		if(k3 == 'A' || k3 == 'a')
			res = "아프리카";		
		else if(k3 == 'B' || k3 == 'b')
			res = "브라질";	
		else if(k3 == 'C' || k3 == 'c')
			res = "캐나다";	
		else
			res = "한국";
		System.out.println("결과 : " + res);	

		//menu가 1이면 카페모카 3500., 2면 카페라테 4000 3이면 아메리카노 3000, 4면 과일쥬스 3500
		//친구와 2잔을 10000내고 먹었다. 잔돈은? (부가세 10% 포함)
		
		int menu = 1;
		//int f2 = 3;
		int pay = 0;
		if( menu == 1)
			pay += 3500 / 10 * 11 * 2;
		else if(menu == 2)
			pay += 4000 / 10 * 11 * 2;
		else if(menu == 3)
			pay += 3000 / 10 * 11 * 2;
		else
			pay += 3500 / 10 * 11 * 2;

		
		
		
		System.out.println("결과 : " + (10000 - pay));	
		
		
		


	}



}