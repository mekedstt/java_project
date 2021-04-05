package com.ict01.grammar.day03;

import java.util.*;
class Ex08{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//숫자를 받아 홀수 짝수 구분
	int i = sc.nextInt();
	
	String res1 = (i%2 == 0) ? "짝수" : "홀수";
	System.out.println(res1);	
	
	//국어 영어 수학을 받아 점수의 평균이 60이상이고, 각각의 점수는 40저 이상일 때 합격, 아니면 불합격
	
	int kor = sc.nextInt(), eng = sc.nextInt(), math = sc.nextInt();
	int sum = kor + eng + math;
	double avg = sum / 3.0;

	String res2 = (avg >= 60) ? (((kor >= 40) && (eng >= 40) && (math >= 40)) ? "합격" : "불합격") : "불합격";
	System.out.println(res2);
	//알바 시간 입력, 시간 당 8720원 ,8시간 초과면 1.5배   받을 금액 계산.
	
	int time = sc.nextInt();
	double res3 = (time >= 10) ? ((time - 8) * (8720 * 1.5) + 8 * 8720) : (time * 8720);
	System.out.println(res3);
	
	
	
	
	
	
	
	
	
	}
}