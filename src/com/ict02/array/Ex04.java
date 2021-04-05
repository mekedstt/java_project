package com.ict02.array;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//순위 구하기
		//1. 모든 사람의 순위를 1등으로 초기화
		//2. 모든 사람들과 비교해야 한다. 자기자신 비교 필요 x
		//3. 나보다 남이 크면 내 순위를 증가
		
		
		int[] su = {270, 265, 280, 290, 285};
		int[] rank = {1,1,1,1,1};
		
		for(int i = 0 ; i < su.length; i++)
		{
			for(int j=0;j<su.length;j++)
			{
				if(su[i] < su[j] && i != j) {
					rank[i]++;
				}
			}
		}
		for(int i = 0 ; i < rank.length; i++)
		{
			System.out.println(rank[i]);
		}
	}

}
