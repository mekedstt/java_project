package com.ict03.class07;

import com.ict03.class07.Ex04.Inner03;

public class Ex04_main {
	public static void main(String[] args) {
		System.out.println(Inner03.i3);
		System.out.println(Inner03.i4);
		
		Inner03 t1 = new Inner03();
		System.out.println(t1.name);
		System.out.println(t1.i2);
		
		t1.play();
	}
}
