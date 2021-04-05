package com.ict04.exception;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//finally
		//try ~ catch ~ finally
		Scanner sc = new Scanner(System.in);
		
		try {
			int var = 27;
			System.out.print("정수 입력 : ");
			int su = sc.nextInt();
			System.out.println("정답 : " + (var/su));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("제대로 입력" + e);
			return;
		}finally {
			System.out.println("반드시 수행 되야함");
		}
		//System.out.println("수고");
		
		
		
	}

}
