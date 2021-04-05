package com.ict03.class03;

import java.util.Scanner;

public class Ex12_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("선택하시오 1. 고양이 2. 강아지 >>> ");
		int s1 = sc.nextInt();
		/*
		if(s1 == 1) {
			Ex10_Cat cat = new Ex10_Cat();
			cat.sound();
			cat.hobby();
			cat.like();
			cat.sleep();
		}else if(s1 == 2){
			Ex11_Dog dog = new Ex11_Dog();
			dog.sound();
			dog.hobby();
			dog.like();
			dog.sleep();
		}*/
		
		Ex09_Animal animal = null;
		if(s1 == 1) {
			animal = new Ex10_Cat();
		}else {
			animal = new Ex11_Dog();
		}
		
		animal.sound();
		animal.like();
		animal.sleep();
	}

}
