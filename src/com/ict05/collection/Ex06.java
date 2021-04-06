package com.ict05.collection;

import java.util.*;

public class Ex06 {

	public static void main(String[] args) {
		// ArrayList(동기화 지원 안함), Vector(동기화 지원 = 동시 접속)
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("박찬호");
		list.add("류현진");
		list.add("손흥민");
		System.out.println(list);
		System.out.println();
		
		list.add(1, "추신수");
		
		System.out.println(list);
		System.out.println();
		
		Vector<String> vector = new Vector<String>();
		vector.add("둘리");
		vector.add("도우너");
		vector.addElement("또치");
		System.out.println(vector);
		System.out.println();
		
		//삽입
		vector.add(2, "희동이");
		System.out.println(vector);
		System.out.println();
		
		if(list.contains("손흥민")) {
			System.out.println(list.indexOf("손흥민")+"번째 위치");
			System.out.println(list.get(3));
			System.out.println(list.get(list.indexOf("손흥민")));
		}else {
			System.out.println("없음");
		}
		//set
		list.set(3, "이대호");
		System.out.println(list);
		System.out.println();
		
		if(list.contains("추신수")) {
			list.set(list.indexOf("추신수"), "이종범");
		}else {
			System.out.println("no");
		}
		System.out.println();
		
		for(String k : list) {
			System.out.println(k);
		}
		System.out.println();
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String s1 = (String)it.next();
			System.out.println(s1);
		}
		System.out.println();
	}

}
