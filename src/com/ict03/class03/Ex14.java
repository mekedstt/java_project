package com.ict03.class03;

public class Ex14 {
	String name = "ȫ�浿";
	int age = 27;
	public Ex14() {
		System.out.println("parents class" + this);
		age = 17;
	}
	
	public Ex14(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
