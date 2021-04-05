package com.ict01.grammar.day03;

class Ex06{

	public static void main(String[] args){
	
	//char k1 이 대문자인지 소문자인지 기타문자인지 판별

	char k1 = 'd';

	String res1 = ((k1 >= 'A') && (k1 <= 'Z')) ? "대문자" : (((k1 >= 'a') && (k1 <= 'z')) ? "소문자" : "기타 문자") ;
	
	System.out.println("결과 : " + res1);
	
	
	
	int k2 = 95;
	String res2 = (k2 >= 90) ? "A학점" : ((k2 >= 80) ?"B학점" : "F학점" )  ;
	
	System.out.println("결과 : " + res2);
	
	int k3 = 1;
	String res3 = (k3 == 1 || k3 == 3) ? "남자" : (k3 == 2 || k3 == 4) ? "여자" : "외국인";
	System.out.println("결과 : " + res3);
	
	
	
	
	
	
	}
}