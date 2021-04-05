package com.ict03.class07;


/*
 1. Member 내부 클래스
 */
public class Ex04 {
	String name = "홍길동";
	private int age = 24;
	static String addr = "우도";
	
	public Ex04() {
		System.out.println("외부 클래스 생성자 : " + this);
	}
	
	public void sound() {
		int money = 1000;
		final int time = 2;
		//static int number2 = 12;
		//static final int number2 = 12;
		System.out.println("외부클래스 메소드 : " + name + ", money : " + money);
		
	}
	
	public static class Inner03 {
		String name = "홍일점";
		final int i2 = 10;
		static int i3 = 20; //내부 클래스는 static 사용 못함 근데 클래스에 static 달면 가능
		static final int i4 = 30; //
		
		public Inner03() {
			System.out.println("내부클래스 생성자 : " + this);
		}
		
		public void play() {
			int money = 50000;
			System.out.println("이름 : " + name);
			System.out.println("금액 : " + money);
			//외부 클래스의 필드 static을 붙어야 사용 가능
			//System.out.println("나이 : " + age);
			//외부 클래스 메소드도 마찬가지
			//sound();
		}
	}
}
