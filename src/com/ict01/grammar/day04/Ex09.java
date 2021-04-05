package com.ict01.grammar.day04;

import java.util.Scanner;

class Ex09 
{
	public static void main(String[] args) 
	{
		//1~10까지 짝수만 출력(continue 사용)
		for(int i = 1;i<11;i++)
		{
			if(i % 2 == 1)
				continue;
			System.out.println(i);
		}






/*
		Scanner sc = new Scanner(System.in);

		while(true) 
		{
			System.out.print("숫자 입력 : ");
			int k = sc.nextInt();
			String msg = "";
			if(k % 2 == 0)
				msg = "짝수";
			else
				msg = "홀수";
			System.out.println(k + "는 " + msg + " 입니다.");
			System.out.print("계속할까요?(1. yes 2. no) >>> ");
			k = sc.nextInt();
			if(k == 2)
				System.out.println("종료합니다.");
				break;
		}
*/
	}
}
