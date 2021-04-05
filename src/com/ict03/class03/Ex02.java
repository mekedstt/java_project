package com.ict03.class03;

public class Ex02 {
	String name = "차범근";
	int age = 57;
	String addr = "서울 우리집 거실";
	private String dog = "댕댕이";
	static int car = 2;
	
	public Ex02() {
		System.out.println("부모클래스 생성자");
	}
	public void prn() {
		System.out.println("부모클래스 메소드");
	}
	
	public static void play() {
		System.out.println("부모 클래스 static 메소드");
	}
	public void eat() {
		System.out.println("먹음");
	}
	public final void walk() {
		System.out.println("함");
	}
	
	
}
