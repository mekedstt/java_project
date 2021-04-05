package com.ict01.grammar.day03;

class Ex05 {

	public static void main(String[] args) {
	
	//int k1이 60이상이면 합격 아니면 불합격

	int k1 = 58;
	String result = (k1 >= 60) ? "합격" : "불합격";
	System.out.println(result);

	//int k2가 홀수인지 짝수인지 판별

	int k2 = 61;
	result = (k2 % 2 == 0) ? "짝수" : "홀수";
	System.out.println(result);
	//char k3가 대문자인지 대문자가 아닌지 판별

	char k3 = 'A';
	result = ((k3 >= 'A') && (k3 <= 'Z')) ? "대문자" : "아니다" ;
	System.out.println(result);
	//근무시간이 8시간까지는 시간당 8720이고 8시간을 초과한 시간만큼은 1.5배
	//현재 근무시간이 10시간, 얼마 받아야하나?
	
	int time = 10;
	double val = (time >= 10) ? ((time - 8) * (8720 * 1.5) + 8 * 8720) : (time * 8720);
	System.out.println(val);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}