package com.ict03.class02;

import java.util.Random;
import java.util.Scanner;

public class BaseBall {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int count_game = 0;
		int count_out = 0;
		
		int[] ball = new int[3];//랜덤
		for (int i = 0; i < ball.length; i++) {
			ball[i] = r.nextInt();			
		}
		
		int[] my_ball = new int[3];//입력
		for (int i = 0; i < my_ball.length; i++) {
			my_ball[i] = sc.nextInt();
		}
		
		int count = 0;
		
		for (int i = 0; i < my_ball.length; i++) {
			if(ball[i] != my_ball[i]) {
				break;
			}
			count++;
		}
		
		if(count != 3) {
			System.out.println("아웃!");
			count_game++;
			count_out++;
		}else {//여기서부터 저거 숫자 맞는지 판별 귀찮다.
			
		}
		
		System.out.println("수고 당신의 도전 횟수는 " + count_game);
		
	}
}
