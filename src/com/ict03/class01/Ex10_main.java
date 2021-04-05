package com.ict03.class01;

import java.util.Iterator;
import java.util.Scanner;

public class Ex10_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Ex10[] arr = new Ex10[4];
		
		int p_count = 0;
		int price = 0;
		System.out.print("사람의 수를 입력 >>> ");
		p_count = sc.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("1. 아메리카노(2500");
			System.out.println("2. 카페모카(3000");
			System.out.println("3. 카페라떼(3500");
			System.out.println("4. 자몽쥬스(3000");
			System.out.print("선택하세요 >>>");
			
			Ex10 product = new Ex10();
			
			int drink = sc.nextInt();
			if(drink == 1) {
				product.setName("아메리카노");
				product.setPrice(2500);				
			}else if(drink == 2) {
				product.setName("카페모카");
				product.setPrice(3000);				
			}else if(drink == 3) {
				product.setName("카페라떼");
				product.setPrice(3500);				
			}else if(drink == 4) {
				product.setName("자몽쥬스");
				product.setPrice(3000);				
			}
			
			arr[i] = product;
		}
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i].getPrice();
		}
		System.out.println("총액 : " + sum);
		System.out.print("입 금 액 ");
		int input = sc.nextInt();
		System.out.println("잔 돈 : " + (input - sum));
		
		
		
		
		
	}	

}
