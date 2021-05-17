package com.ict04.exception;

public class Ex01 {

	public static void main(String[] args) {
		/*
			예외처리.
			추가내용
			추추추가내용
			추추추가내용
		*/
		try {
				int[] var = {10,20,30};
			for(int i = 0;i<=var.length;i++) {
				System.out.println(1);
				System.out.println(2);
				System.out.println("var[" + i + "] = " + var[i]);
				System.out.println(3);
				System.out.println(4);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("수고");
	}

}
