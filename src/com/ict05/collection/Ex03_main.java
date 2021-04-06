package com.ict05.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex03 coffee = new Ex03();
		
		coffee.setName("커피음료");
		coffee.setPrice(2500);
		
		Ex03 cola = new Ex03("콜라", 1600);
		Ex03 juice = new Ex03("쥬스", 2300);
		
		//객체들을 저장하고 관리하는 방법
		//1. 배열
		Ex03[] arr = new Ex03[3];
		arr[0] = coffee;
		arr[1] = cola;
		arr[2] = juice;
		
		for(Ex03 k : arr) {
			System.out.println("이름 : " + k.getName());
			System.out.println("가격 : " + k.getPrice());
		}
		System.out.println();
		
		//2. 컬렉션
		HashSet<Ex03> h1 = new HashSet<>();
		//추가
		h1.add(coffee);
		h1.add(cola);
		h1.add(juice);
		//더 추가할 수 있음(배열은 못하지)
		h1.add(new Ex03("ion", 1500));
		//이름 가격 꺼내기
		//1. 개선된 for문
		for(Ex03 k : h1) {
			System.out.println("이름 : " + k.getName());
			System.out.println("가격 : " + k.getPrice());
		}
		System.out.println();
		//2. iterator() 
		Iterator<Ex03> it = h1.iterator();
		while(it.hasNext()) {
			Ex03 s1 = (Ex03) it.next();
			System.out.println("이름 : " + s1.getName());
			System.out.println("가격 : " + s1.getPrice());
		}
		System.out.println();
		
		//포함 여부 : contains
		if(h1.contains(coffee)) {
			System.out.println("있다.");
		}else {
			System.out.println("없다.");
		}
		System.out.println(h1.size());
		
		if(h1.contains(cola)) {
			h1.remove(cola);
			System.out.println(cola.getName() + "삭제");
		}else {
			System.out.println("존재하지 않습니다.");
		}
		System.out.println();
		
		h1.clear();
		if(h1.isEmpty()) {
			System.out.println("비어있음");
		}else {
			System.out.println("비어잇지 않음");
		}
		
		
		
		
		
		
	}

}
