package com.ict05.collection;

import java.util.*;

public class Ex07 {

	public static void main(String[] args) {
		// Queue(큐)
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("박찬호");
		linkedList.offer("박세리");
		linkedList.add("김미현");
		
		System.out.println(linkedList);
		
		linkedList.addFirst("김광현");
		System.out.println(linkedList);
		
		linkedList.offerFirst("둘리");
		System.out.println(linkedList);
		
		if(linkedList.contains("박세리")) {
			System.out.println(linkedList.indexOf("박세리")+"번째 위치");
			System.out.println(linkedList.get(3));
			System.out.println(linkedList.get(linkedList.indexOf("박세리")));
		}else {
			System.out.println("없음");
		}
		
		//삭제 remove
		linkedList.removeFirst();
		System.out.println(linkedList);
		
		linkedList.removeLast();
		System.out.println(linkedList);
		
		System.out.println(linkedList.remove(1) + "님이 삭제 되었습니다.");
		System.out.println(linkedList);
		System.out.println();
	}

}
