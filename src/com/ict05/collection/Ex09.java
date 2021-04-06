package com.ict05.collection;

import java.util.*;


public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("한국", "서울");
		map.put("대한한국", "서울");
		map.put("KOREA", "서울");
		map.put("korea", "서울");
		map.put("미국", "워싱턴");
		map.put("중국", "북경");
		map.put("일본", "동경");
		map.put("태국", "방콕");
		map.put("캐나다", "어타와");
		
		Set<String> sets = map.keySet();
		
		Scanner sc = new Scanner(System.in);
		
		esc:
		while(true) {
			System.out.print("나라 : ");
			String msg = sc.next();
			if(sets.contains(msg)) {
				String result = map.get(msg);
				System.out.println(msg + "의 수도는 " + result + "이다.");
			}else {
				System.out.println("데이터에 없는 나라다.");
			}
			
			while(true) {
				System.out.print("계속 할까요? (y/n) : ");
				String str = sc.next();
				if(str.equalsIgnoreCase("y")) {
					continue esc;
				}else if(str.equalsIgnoreCase("n")) {
					break esc;
				}else {
					System.out.println("잘 못 입력하셨습니다. 다시 입력하세요(y/n) : ");
					continue;
				}
			}
		}
		
	}

}
