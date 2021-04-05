package com.ict01.grammar.day04;

class  Ex02
{
	public static void main(String[] args) 
	{
		//안녕하세요 10번 출력


		for(int i=0;i<10;i++)
		{
			System.out.println("안녕하세요." + (i + 1));
		}

		for (int i = 0;i < 16 ;i++ )
		{
			System.out.print(i + " ");
		}
		System.out.println();

		//0~10 짝수 출력
		System.out.print("0~10 짝수 결과 : "); 
		for (int i = 0;i <= 10 ;i++ )
		{
			if(i % 2 == 0)
				System.out.print(i + " ");
		}
		System.out.println();


		//0~10 홀수 출력
		System.out.print("0~10 홀수 결과 : "); 
		for (int i = 0;i <= 10 ;i++ )
		{
			if(i % 2 != 0)
				System.out.print(i + " ");
		}
		System.out.println();
		//0~50 7의 배수 출력
		System.out.print("0~50 7의 배수 결과 : "); 
		for (int i = 1;i <= 50 ;i++ )
		{
			if(i % 7 == 0)
				System.out.print(i + " ");
		}
		System.out.println();

		//5단 출력
		System.out.print("구구단 5단 결과 : "); 
		for (int i = 1;i < 10 ;i++ )
		{			
			System.out.print(i * 5 + " ");
		}

		//홀수의 누적합과 짝수의 누적합을 각각 구하시오
		int sum_couple = 0;
		for (int i = 1; i < 11 ;i++ )
		{
			if(i%2==0)
			{
				sum_couple += i;
			}
		}
		int sum_solo = 0;
		for (int i = 1; i < 11 ;i++ )
		{
			if(i%2==1)
			{
				sum_solo += i;
			}
		}




	}
}
