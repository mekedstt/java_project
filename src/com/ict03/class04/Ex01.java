package com.ict03.class04;

public abstract class Ex01 {
	//추상 클래스 : 추상 메소드를 가지고 있는 클래스
	
	//추상 메소드 : 구체화가 되지 않은 메소드를 의미, body 블록이 없는 메소드 = 실행문 x
	//           반드시 abstract 예약어 사용
	//다형성 : 하나의 메소드나 클래스가 있을 때 이것을 다양한 방법으로  동작 시키는 것을 의미
	
	int s1 = 10;
	static int s2 = 10;
	final int S3 = 10;
	static final int S4 = 10;
	
	public void play() {
		System.out.println("인스턴스 메소드");
	}
	public static void prn() {
		System.out.println("static 메소드");
	}
	
	
	//추상 메소드
	public abstract void sound();
	
}
