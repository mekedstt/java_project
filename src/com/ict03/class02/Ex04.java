package com.ict03.class02;

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int game = 1;
		
		while(game == 1) {
			System.out.print("하나를 고르시오 : 가위(0) 바위(1) 보(2) >>>");
			int rcp = sc.nextInt();
			
			
			int c_rcp = r.nextInt(3);
			
			
			if(rcp == c_rcp) {
				System.out.println("무승부 입니다.");
			}else if((rcp == 0 && c_rcp == 2) || (rcp == 1 && c_rcp == 0) || 
					(rcp == 2 && c_rcp == 1)) {
				System.out.println("당신의 승리 입니다.");
			}else if((rcp == 0 && c_rcp == 1) || (rcp == 1 && c_rcp == 2) || 
					(rcp == 2 && c_rcp == 0)){
				System.out.println("당신의 패배 입니다.");
			}else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			System.out.print("계속 하시곘습니까? yes(1), no(2) >>> ");
			game = sc.nextInt();
		}	
	}
}


