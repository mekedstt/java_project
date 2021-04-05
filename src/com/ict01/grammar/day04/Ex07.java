package com.ict01.grammar.day04;

class Ex07 
{
	public static void main(String[] args) 
	{
		//break, continue;


		for (int i = 1;i < 11 ;i++ )
		{
			
			if(i == 4)
			{
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 1;i < 11 ;i++ )
		{
			
			if(i == 4)
			{
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println();


		for(int i = 1; i < 4; i++)
		{
			for (int j = 1;j < 6 ;j++ )
			{
				if(j == 3) break;
				System.out.println("i = " + i + ", j = " + j);
			}
		}

		for(int i = 1; i < 4; i++)
		{
			for (int j = 1;j < 6 ;j++ )
			{
				if(i == 2) break;
				System.out.println("i = " + i + ", j = " + j);
			}
		}








































	}
}
