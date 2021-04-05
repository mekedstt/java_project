package com.ict01.grammar.day02;

class Ex07{

	public static void main(String[] args) {
	//1번 이름이 홍길동인 사람의 국어, 영어, 수학 점수가 90 80 90
	//총점과 평균을 구하시오. 이름 총점 평균을 출력 (평균은 소숫점 첫째자리 까지

	int kor = 90, eng = 80, math = 90;
	String name = "홍길동";
	int sum = kor + eng + math;

	int avg1 = (sum * 10) / 3;
	System.out.println(avg1);
	double avg2 = (double)avg1 / 10;

	System.out.println("이름 : " +name + " 총점 : " + sum + " 평균 : " + avg2);
	}

}