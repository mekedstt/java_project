package com.ict01.grammar.day04;

class Ex04 
{
	public static void main(String[] args) 
	{
		int i = 0;
		//0-15 출력
		System.out.println("0-15 출력");
		while(i<16)
		{
			System.out.println(i++);
		}
		//0-10 홀수만
		System.out.println("0-10 홀수만");
		i = 0;
		while(i < 11)
		{
			if(i % 2 == 1)
			{
				System.out.println(i);
			}
			i++;
		}
		//0-10 짝수만
		System.out.println("0-10 짝수만");
		i = 0;
		while(i < 11)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
			}
			i++;
		}
		//0-50 7의 배수
		System.out.println("0-50 7배수만");
		i = 0;
		while(i < 51)
		{
			if(i % 7 == 0)
			{
				System.out.println(i);
			}
			i++;
		}
		//5단
		System.out.println("5단");
		i = 1;
		while(i < 10)
		{
			System.out.println("5단 : " + (i * 5));
			i++;
		}
		//0000
		//0000
		//0000
		//0000
		System.out.println("0 16개");
		i = 0;
		while(true)
		{
			if(i>=4)
			{
				break;
			}
			System.out.println("0 0 0 0");
			i++;
		}
		//0-10 누적 합
		System.out.println("0-10 누적합");
		i = 0;
		int sum = 0;
		while(true)
		{
			if(i > 10)
			{
				break;
			}
			sum += i;
			i++;			
		}
		System.out.println(sum);
		//홀수 짝수의 누적합 각각 0-10
		System.out.println("0-10 홀짝 누적합");
		i = 0;
		int sum_solo = 0;
		int sum_couple = 0;
		while(true)
		{
			if(i > 10)
			{
				break;
			}
			else if(i % 2 == 0)
			{
				sum_couple += i;
			}
			else{
				sum_solo += i;
			}
			i++;			
		}
		System.out.println("짝수 합 : " + sum_couple + "홀수 합 : " + sum_solo);
	}
}
