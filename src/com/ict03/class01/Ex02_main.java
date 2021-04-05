package com.ict03.class01;

public class Ex02_main {

	public static void main(String[] args) {
		// 1. Ex02 클래스 생성자 존재 X 따라서 기본 생성자로 객체 생성
		//클래스 참조변수 = new 생성자;
		
		//void는 정보가 넘어오지 않는다.
		//void가 아니면 반환형에 맞춰서 저장
		System.out.println(Ex02.K2);
		System.out.println(Ex02.K4);		
		
		Ex02.prn02();
		
		double su1 = Ex02.prn04();
		System.out.println(su1);
		
		
		Ex02 test = new Ex02();
		System.out.println(test);
		System.out.println(test.k1);
		System.out.println(test.K2);
		System.out.println(test.K3);
		System.out.println(test.K4);
		
	}

}
