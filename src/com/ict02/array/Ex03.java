package com.ict02.array;

import java.util.*;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] su = {3,4,9,5,6,1,7,2,10,8};
		int tmp;
		
		for (int i = 0; i < su.length; i++) {
			for (int j = i + 1; j < su.length; j++) {
				if(su[i] > su[j])
				{
					tmp = su[i];
					su[i] = su[j];
					su[j] = tmp;
					
				}
			}
		}
		for (int i = 0; i < su.length; i++) {
			System.out.println(su[i]);
		}
		
		
		int[] su2 = {3,4,9,5,6,1,7,2,10,8};
		Arrays.sort(su2);
		
		for (int i = 0; i < su.length; i++) {
			System.out.println(su2[i]);
		}
		
		Integer [] su3 = {3,4,9,5,6,1,7,2,10,8};
		
		Arrays.sort(su3, Collections.reverseOrder());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
