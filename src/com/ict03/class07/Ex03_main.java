package com.ict03.class07;

public class Ex03_main {

	public static void main(String[] args) {
		// 별도로 객체 생성 못함
		
		Ex03 t1 = new Ex03();
		
		//내부 클래스를 가지고 있는 메소드를 실행해야 내부 클래스를 만들 조건이 됨
		//내부 클래스의 끝과 내부 클래스를 가진 메소드의 끝 사이에서 객체 생성과 실행을 해야한다.
		t1.play();
		
		
		
		
		
		
	}

}
