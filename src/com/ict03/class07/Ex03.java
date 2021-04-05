package com.ict03.class07;

public class Ex03 {
	String name = "둘리";
	int hight = 160;
	public Ex03() {
		System.out.println("Out : " + this);
	}
	public void sound() {
		String addr = "Seoul";
		System.out.println("Hoi!");
	}
	
	//내부 클래스를 담은 메소드.
	public void play() {
		int age = 24;
		class Inner02{ //public can't use
			String name = "Hydong";
			int time = 36;
			public Inner02 () {
				System.out.println("In : " + this);
			}
			public void hobby() {
				System.out.println(name);
				System.out.println(hight);
				//System.out.println(addr);//자기가 속한 메소드 아니라서 못 씀
				System.out.println(age);
				System.out.println(time);
			}//내부 메소드 끝
		}//내부 클래스 끝
		Inner02 in02 = new Inner02();
		//외부 멤버
		System.out.println(name);
		//외부 메소드
		sound();
		
	}//외부 메소드 끝
}
