package com.ict01.grammar.day04;

import java.lang.*;
import java.util.*;

class Ex06 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);


		int i = 0;
		do
		{
			System.out.print(i + " ");
			i++;
		}while (i < 11);
		System.out.println();

		//반복횟수 입력받아 처리하기
		System.out.print("반복 횟수 : ");
		i = sc.nextInt();
		do
		{
			System.out.print(i + " ");
			i--;
		}while (i > 0);
		System.out.println();
	
		//반복 횟수와 일반 숫자를 받아서 홀수, 짝수를 출력.
		System.out.print("횟수를 입력하시오 : ");
		i = sc.nextInt();
		int num;
		do
		{
			System.out.print("숫자를 입력하시오 : ");
			num = sc.nextInt();
			if(num % 2 == 0){
				System.out.println(num + "은 짝수 입니다.");
			}
			else
				System.out.println(num + "은 홀수 입니다.");
			i--;
		}while (i > 0);
		System.out.println();






















	}
		

}
