package com.ict03.class01;

public class Ex06_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex06 t = new Ex06();
		
		String s1 = t.getName();
		System.out.println("이름 : " + s1);
		int s2 = t.getAge();
		System.out.println("나이 : " + s2);
		double s3 = t.getHeight();
		System.out.println("키 : " + s3);
		char s4 = t.getRank();
		System.out.println("순위 : " + s4);
		
		t.setName("고길동");
		s1 = t.getName();
		System.out.println("이름 : " + s1);
		t.setAge(37);
		s2 = t.getAge();
		System.out.println("나이 : " + s2);
		t.setHeight(175);
		s3 = t.getHeight();
		System.out.println("키 : " + s3);
		t.setRank('B');
		s1 = t.getName();
		System.out.println("이름 : " + s1);
		
	}

}
