package com.ict04.exception;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// throws (예외 양도, 전가)
		Ex05 test = new Ex05();
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("정수 입력 : ");
		String msg = sc.next();
		test.setData(msg);
		} catch (Exception e) {
			System.out.println("첫 글자는 숫자로 하자");
		}
		
	}
	public void setData(String msg) {
		if(msg.length()>=1) {//글자 길이가 하나 이상 일 때 실행
			String str = msg.substring(0, 1);//첫글자만 추출
			prnData(str);
		}
	}
	public void prnData(String str) throws NumberFormatException {
		int dan = Integer.parseInt(str);
		System.out.println(dan + "단");
		for (int i = 0; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + (dan * i));
		}
	}
}
