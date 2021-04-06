package com.ict05.collection;

import java.util.*;

public class Ex08 {

	public static void main(String[] args) {
		// Map 인터페이스
		
		//1. key를 숫자로만들면 for문 가능
		
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "한국");
		map1.put(2, "미국");
		map1.put(3, "중국");
		map1.put(4, "영국");
		map1.put(5, "태국");
		System.out.println(map1);
		
		map1.put(3, "일본");//키가 중복되서 덮어쓰기
		System.out.println(map1);
		
		map1.put(6, "한국");//키가 중복되서 덮어쓰기
		System.out.println(map1);
		
		System.out.println(map1.get(1));
		System.out.println(map1.get(2));
		System.out.println(map1.get(3));
		System.out.println(map1.get(4));
		System.out.println(map1.get(5));
		System.out.println("================================");
		for(int i = 0;i<map1.size();i++)
		{
			System.out.println(map1.get(i+1));
		}
		System.out.println("================================");
		//개선된 for문 사용
		for(Integer k : map1.keySet()) {
			System.out.println(map1.get(k));
		}
		
		System.out.println("================================");
		
		//iterator사용
		Iterator<Integer> it = map1.keySet().iterator();
		while(it.hasNext()) {
			int s1 = (int)it.next();
			System.out.println(map1.get(s1));
		}
		System.out.println("================================");
		//2. key를 문자로 만들면 출력 시 iterator를 사용해야함
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("이름", "고길동");
		map2.put("나이", "34");
		map2.put("주소", "도봉구");
		map2.put("성별", "남");
		map2.put("취미", "잠자기");
		
		
		System.out.println(map2.get("이름"));
		System.out.println(map2.get("나이"));
		System.out.println(map2.get("주소"));
		System.out.println(map2.get("성별"));
		System.out.println(map2.get("취미"));
		System.out.println();
		System.out.println("================================");
		for(String k : map2.keySet()) {
			System.out.println(map2.get(k));
		}
		System.out.println("================================");
		Iterator<String> it2 = map2.keySet().iterator();
		
		while(it2.hasNext()) {
			String k = (String) it2.next();
			System.out.println(map2.get(k));
		}
		
		System.out.println("================================");
		
		
		
		
		
		
	}
}
