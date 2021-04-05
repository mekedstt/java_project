package com.ict03.class02;

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		
		
		System.out.println(r.nextBoolean());
		System.out.println(r.nextInt());
		System.out.println(r.nextLong());
		
		System.out.println(r.nextFloat());
		
		
		
		int s1 = r.nextInt(3);
		System.out.println(s1);
		
		int s2 = (int)(r.nextDouble()*3);
		System.out.println(s2);
		
		//Math
		int s3 = (int)(Math.random()*3);
		System.out.println(Math.random()*3);
		System.out.println(s3);
		System.out.println();
		
		//절대값
		System.out.println(Math.abs(100));
		System.out.println(Math.abs(-100));
		
		//ceil올림 round반올림 floor버림
		
		System.out.println(Math.ceil(3.14));
		System.out.println(Math.round(3.14));
		System.out.println(Math.floor(3.14));
		
		
		//큰거 작은거
		System.out.println(Math.max(4, 5));
		System.out.println(Math.min(4, 5));
		
		//pow
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.pow(3, 2));
		
		
		String quiz = "010-7777-9999";
		String[] answer = quiz.split("-");
		answer[1] = answer[1].replace(answer[1], "XXXX");
		System.out.println(answer[0] + "-" + answer[1] + "-" + answer[2]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
