package com.ict04.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//다중 catch문
		//
		
		Scanner sc = new Scanner(System.in);
		
		/*try {
			int var = 3;
			System.out.print("정수 입력 : ");
			int su = sc.nextInt();
			System.out.println("정답 : " + (var/su));
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("숫자라고 숫자 시발아");
		}catch(ArithmeticException e) {
			System.out.println("0으로 안나눠져");
		}*/
		
		try {
			int var = 27;
			System.out.print("정수 입력 : ");
			int su = sc.nextInt();
			System.out.println("정답 : " + (var/su));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("제대로 입력");
		}
		System.out.println("수고");
	}

}
