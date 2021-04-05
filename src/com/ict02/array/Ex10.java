package com.ict02.array;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//번호 국어 영어 수학 점수 입력 받기
		//번호 총점 평균 학점 순위 구하고 정렬(순위 기준으로 하자)
		
		int[][] arr = new int[5][5];
		
		int kor;
		int eng;
		int math;
		
		System.out.println("5명의 학생들의 점수를 입력하라.");
		
		for(int i = 0;i < arr.length; i++)
		{
			System.out.print("국어 : ");
			kor = sc.nextInt();
			System.out.print("영어 : ");
			eng = sc.nextInt();
			System.out.print("수학 : ");
			math = sc.nextInt();
			arr[i][0] = i + 1;
			arr[i][1] = kor + eng + math;
			arr[i][2] = (int)(arr[i][1] / 3 * 10.0) / 10;
			if(arr[i][2] >= 90) {
				arr[i][3] = 'A';
			} else if(arr[i][2] >= 80){
				arr[i][3] = 'B';
			} else if(arr[i][2] >= 70){
				arr[i][3] = 'C';
			} else {
				arr[i][3] = 'F';
			}
			arr[i][4] = 1;
		}
		//순위
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][1] > arr[j][1] && i != j)
				{
					arr[j][4]++;
				}
			}			
		}
		
		
		
		
		
		
		
		
		
		//정렬
		int[] tmp = new int[5];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][4] < arr[j][4]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}			
		}
		System.out.println("번 호\t총 점\t평 균\t학 점\t순 위");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(j == 3)
				{
					System.out.print((char)arr[i][j] + "\t");
				}else {
					System.out.print(arr[i][j] + "\t");	
				}				
			}			
			System.out.println();
		}
	}
}
