package com.ict02.array;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"홍", "임", "장", "박", "이"};
		Scanner sc = new Scanner(System.in);
		
		int[] kor = {80,90,80,70,100};
		int[] eng = {80,95,85,75,100};
		int[] math = {100,100,80,100,100};
		int[] rank = {1, 1, 1, 1, 1};
		
		
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] hak = new String[5];
		
		for(int i=0;i<hak.length;i++)
		{
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int)(sum[i] / 3.0 * 10) / 10.0;
			if(avg[i] >= 90) {
				hak[i] = "A";
			}else if(avg[i] >= 80) {
				hak[i] = "B";
			}else if(avg[i] >= 70) {
				hak[i] = "C";
			}else {
				hak[i] = "F";
			}
		}
		for(int i = 0 ; i < sum.length; i++)
		{
			for(int j=0;j<sum.length;j++)
			{
				if(sum[i] < sum[j] && i != j) {
					rank[i]++;
				}
			}
		}
		//System.out.println("이 름 \t총 점\t평 균\t학 점\t순 위");
		/*for(int i=0;i<hak.length;i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(hak[i] + "\t");
			System.out.println(rank[i]);
		}*/
		System.out.print("이름을 입력하시오 : ");
		String name_input = sc.next();
		System.out.println("이 름 \t총 점\t평 균\t학 점\t순 위");
		for(int i=0;i<hak.length;i++) {
			if(name[i].equals(name_input)) {
				System.out.print(name[i] + "\t");
				System.out.print(sum[i] + "\t");
				System.out.print(avg[i] + "\t");
				System.out.print(hak[i] + "\t");
				System.out.println(rank[i]);
			}
		}
		
		
		
		
		
	}
}
