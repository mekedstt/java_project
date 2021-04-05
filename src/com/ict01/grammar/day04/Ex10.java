package com.ict01.grammar.day04;

import java.util.Scanner;
class Ex10 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		esc1:
		while(true){
			System.out.print("숫자 입력 : ");
			int k = sc.nextInt();
			String msg = "";
			if(k % 2 == 0){
				msg = "짝수";
			}
			else
				msg = "홀수";

			System.out.println(k + "는 " + msg + " 입니다.");
			while(true) {
				System.out.print("계속할까요? (1. yes 2. no) >>> ");
				int k2 = sc.nextInt();
				if(k2 == 1) 
					break;
				else if(k2 ==2) 
					break esc1;
				else 
					System.out.println("다시 입력 해주십시오.(1. yes 2. no) >>>");
			}
		}
		System.out.println("안쪽 while문 끝");
	}
}
