package com.ict03.class03;

public class Ex03 extends Ex02{
	String name = "차두리";
	int age = 34;
	static String hobby = "영화보기";
	
	
	public Ex03() {
		System.out.println("자식클래스 생성자");
		
	}
	public void sound() {
		System.out.println("자식 클래스 메소드");
	}
	
	public void study() {
		System.out.println("공부 장소 : " + addr);
		System.out.println("내 이름 : " + name);
		System.out.println("아부지 이름 : " + super.name);
	}
	@Override
	public void eat() {
		System.out.println("안먹음");
	}
	
	
}
