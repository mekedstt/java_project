package com.ict01.grammar.day04;

class Ex05 
{
	public static void main(String[] args) 
	{
		
		int i = 2;
		while(i < 10)
		{
			System.out.println(i + "단");
			int j = 1;
			while(j < 10)
			{
				System.out.println(i + " * " + j + " = " + (i * j) + " ");
				j++;
				
			}
			i++;

		}
		
		//구구단2

		i = 2;
		while(i < 10)
		{
			System.out.println(i + "단");
			int j = 1;
			while(j < 10)
			{
				System.out.print(i + " * " + j + " = " + (i * j) + " ");
				j++;
				
			}
			System.out.println();
			i++;

		}
		//구구단3
		i = 1;
		while(i < 10)
		{
			System.out.println(i + "단");
			int j = 2;
			while(j < 10)
			{
				System.out.print(j + " * " + i + " = " + (i * j) + " ");
				j++;
				
			}
			System.out.println();
			i++;

		}
		//1000
		//0100
		//0010
		//0001
		i = 0;
		while(i < 4)
		{			
			int j = 0;
			while(j < 4)
			{
				if(i==j)
				{
					System.out.print("1");
				}
				else 
					System.out.print("0");
				j++;
				
			}
			System.out.println();
			i++;

		}




















	}
}
