package com.ict01.grammar.day04;

class Ex03 
{
	public static void main(String[] args) 
	{
		/*for (int i = 1; i < 4 ;i++ )
		{
			for (int j = 1;j<6 ; j++ )
			{
				System.out.println("i = " + i + ", j = " + j);
			}
		}*/




		/*for (int i = 2; i < 10 ;i++ )
		{
			System.out.println(i + "��");
			for (int j = 1;j< 10 ; j++ )
			{
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}*/

		/*for (int i = 2; i < 10 ;i++ )
		{
			System.out.println(i + "��");
			for (int j = 1;j< 10 ; j++ )
			{
				System.out.print(i + " * " + j + " = " + (i * j) + " ");
			}
			System.out.println();
		}*/



		/*for (int i = 1; i < 10 ;i++ )
		{
			System.out.println(i + "��");
			for (int j = 2;j< 10 ; j++ )
			{
				System.out.print(j + " * " + i + " = " + (i * j) + " ");
			}
			System.out.println();
		}*/


		for (int i = 0; i < 4 ;i++ )
		{
			for (int j = 0;j < 4 ;j++ )
			{
				System.out.print(" 0 "); 
			}
				System.out.println();
		}

		for (int i = 0; i < 4 ;i++ )
		{
			for (int j = 0;j < 4 ;j++ )
			{
				if(i == j)
				{
					System.out.print(" 1 "); 
				}
				else 
					System.out.print(" 0 "); 
			}
				System.out.println();
		}







	}
}
