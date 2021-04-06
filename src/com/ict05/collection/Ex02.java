package com.ict05.collection;

import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		// 
		// Set 인터페이스를 상속받은 클래스 : HashSet, TreeSet
		// -HashSet과 TreeSet 사용 방법은 모두 같다
		// 	그러나 TreeSet은 내부에서 항상 오름 차순 정렬 상태를 유지
		// set은 특정 기준으로 정렬을 할 수 없다.
		// -HashSet, TreeSet 중복 안됨
		// 
		// 컬렉션 생성
		// HashSet<제네릭타입 = 객체 타입 = 같은 클래스> 참조변수 = new HashSet<제네릭타입>();
		// HashSet<제네릭타입 = 객체 타입 = 같은 클래스> 참조변수 = new HashSet<>();
		HashSet<String> h1 = new HashSet<>();
		HashSet<Integer> h2 = new HashSet<>();
		HashSet<Double> h3 = new HashSet<>();
		HashSet<Boolean> h4 = new HashSet<>();
		
		/* h2 (정수형)에 객체를 추가하는 방법
		   방법1) 기본 자료형을 객체로 만들어서 넣기 =>Boxing
		*/
		
		Integer k1 = new Integer(10);
		Integer k2 = new Integer("10");
		//방법 2 기본 자료형을 그냥 넣는다, 기본자료형이 자동으로 객체가 되어서(AutoBoxing) 넣어짐
		
		//h2 컬렉션에 객체 넣기(add(요소))
		h2.add(k1);
		h2.add(k2);
		h2.add(10);
		
		h2.add(new Integer(10));
		//같은 제네릭 타입 아니면 오류임
		h3.add(3.14);
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h3);
		
		
		h1.add("java");
		h1.add("Java");
		h1.add("JAVA");
		h1.add("jsp");
		h1.add("JSP");
		h1.add("spring");
		System.out.println(h1);
		//하나씩 꺼내서 사용
		//1, 개선된 for문 사용(일반 for문은 사용 못함 ==index가 없음)
		//2. iterator();
		
		for(String k : h1) {
			String msg = k;
			System.out.println(msg);
		}
		Iterator<String> it = h1.iterator();
		while(it.hasNext()) {
			String msg = (String) it.next();
			System.out.println(msg);
		}
	}

}
