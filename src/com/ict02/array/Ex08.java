package com.ict02.array;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] ch1 = new char[3][];
		
		
		char[] c1 = {'j','a','v','a'};
		char[] c2 = {'J','A', 'V', 'A'};
		char[] c3 = {'A', 'n', 'd', 'r', 'o', 'i','d'};
		
		ch1[0] = c1;
		ch1[1] = c2;
		ch1[2] = c3;
		
		for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch1[i].length; j++) {
				System.out.print(ch1[i][j] + " ");
				}
			System.out.println();
		}
	
		
		char[][] ch2 = {{'J','A','V','A'}, {'ÀÚ', '¹Ù'}, {'1', '2', '3'}};
		
		for (int i = 0; i < ch2.length; i++) {
			for (int j = 0; j < ch2[i].length; j++) {
				System.out.print(ch2[i][j] + " ");
				}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
