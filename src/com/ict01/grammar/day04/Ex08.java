package com.ict01.grammar.day04;

class Ex08
{
	public static void main(String[] args) 
	{
		
		/*for (int i = 1;i<11 ;i++ )
		{
			if(i==5) break;
			System.out.print(i + " ");
		}*/



		/*esc1 : 		
		for (int i = 1;i<11 ;i++ )
		{
			for(int j = 1;j<11;j++)
			{
				if(i==5) break esc1;
				System.out.print(i + " ");
			}
		}*/

		/*esc2:
		for (int i = 1;i<4 ;i++ )
		{
			for(int j = 1;j<6;j++)
			{
				if(j==3) break esc2;
				System.out.print("i = " + i + " j = " + j);
			}
			System.out.println();
		}


		esc3 : 		
		for (int i = 1;i<11 ;i++ )
		{
			for(int j = 1;j<11;j++)
			{
				if(i==5) continue esc3;
				System.out.print(i + " ");
			}
		}*/

		esc4:
		for (int i = 1;i<4 ;i++ )
		{
			for(int j = 1;j<6;j++)
			{
				if(j==3) continue esc4;
				System.out.println("i = " + i + " j = " + j);
			}
		}





















	}
}
