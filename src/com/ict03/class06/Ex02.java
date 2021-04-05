package com.ict03.class06;


enum Type{
	WALKING, RUNNING, TRACKING, HIKING
}

public class Ex02 {
	String name;
	int size;
	Type type;
	
	public static void main(String[] args) {
		//오류 
		//System.out.println(name);
		//근데 객체를 만들어서 하면 사용 가능
		
		Ex02 shoes = new Ex02();
		
		shoes.name = "나이키";
		shoes.size = 275;
		shoes.type = Type.RUNNING;
		System.out.println("신발이름 : " + shoes.name);
		System.out.println("신발사이즈 : + shoes.size ");
		System.out.println("신발타입 : + shoes.type ");
	}
}
