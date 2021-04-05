package com.ict03.class01;

public class Ex11_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ex11 test1 = new Ex11();
		Ex11 test1 = new Ex11("임꺽정", 17);
		System.out.println("이름 : " + test1.getName());
		System.out.println("나이 : " + test1.getAge());
		System.out.println("성별 : " + test1.isGender());
		
		Ex11 test2 = new Ex11();
		
		System.out.println("이름 : " + test2.getName());
		System.out.println("나이 : " + test2.getAge());
		System.out.println("성별 : " + test2.isGender());
		System.out.println();
		
		test2.setName("일지매");
		System.out.println("이름 : " + test2.getName());
		System.out.println("나이 : " + test2.getAge());
		System.out.println("성별 : " + test2.isGender());
		System.out.println();
		
	}

}
