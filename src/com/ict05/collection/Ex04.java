package com.ict05.collection;

import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> lotto = new HashSet<Integer>();
		for (int i = 0; i < 6; i++) {
			int k = (int)(Math.random() * 45) + 1; // 1~45
			boolean b = lotto.add(k);
			if(!b) {
				i--;
			}
		}
		System.out.println(lotto);
		TreeSet<Integer> lotto2 = new TreeSet<Integer>();
		for (int i = 0; i < 6; i++) {
			int k = (int)(Math.random() * 45) + 1; // 1~45
			boolean b = lotto2.add(k);
			if(!b) {
				i--;
			}
		}
		System.out.println(lotto2);
	}

}
