package com.ict03.class03;

public class Ex04_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex03 t1 = new Ex03();
		
		System.out.println(t1);
		
		
		//부모 자식이 갖은 객체를 가지면 자식멤버를 먼저 사용 == 메소드도 마찬가지
		System.out.println(t1.name);
		System.out.println(t1.addr);
		
		
		
		t1.sound();
		t1.prn();
		
		System.out.println(Ex03.hobby);
		System.out.println(Ex02.car);
		t1.eat();
	}

}
