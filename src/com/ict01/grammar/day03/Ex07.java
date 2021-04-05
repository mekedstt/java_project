package com.ict01.grammar.day03;

import java.util.Scanner;

class Ex07 { 
	public static void main(String[] args) {
	
	int k2 = 14;

	Scanner sc = new Scanner(System.in);
	
	System.out.print("당신의 이름은 : ");
	
	System.out.println(sc.next());
	
	System.out.print("국어 점수 : ");
	int kor = sc.nextInt();

	System.out.print("영어 점수 : ");
	
	int eng = sc.nextInt();
	System.out.print("수학 점수 : ");
	
	int math = sc.nextInt();
	
	int sum = kor + eng + math;
	System.out.print("총점 : " + sum);
	
	System.out.print("키 : ");
	
	double height = sc.nextDouble();
	System.out.println(height);
	System.out.print("성별은 남성?<true/false> : ");
	
	boolean sex = sc.nextBoolean();
	String str = sex ? "남성입니다" : "여성입니다";
	System.out.print(str);
	
	
	
	
	
	}

}