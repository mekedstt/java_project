package com.ict05.collection;

import java.util.*;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		stack.add("둘리");
		stack.addElement("공실이");
		stack.push("마이콜");
		System.out.println(stack);
		
		
		stack.add("도우너");
		stack.add("또치");
		stack.add("뿌끄");
		stack.add("둘리");
		System.out.println(stack);
		System.out.println("=================");
		
		System.out.println(stack.peek());
		System.out.println(stack);
		
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println();
		
		
		
		if(stack.contains("둘리")) {
			System.out.println(stack.indexOf("둘리") + "번째 위치");
			System.out.println(stack.search("둘리") + "번째 위치");
			System.out.println(stack.get(1));
			System.out.println(stack.get(stack.indexOf("둘리")));
			System.out.println(stack.elementAt(stack.indexOf("둘리")));
			System.out.println(stack.firstElement());
			System.out.println(stack.lastElement());
		}else {
			System.out.println("존재하지 않음");
		}
		System.out.println(stack.size() + "요소가 존재합니다.");
		
		stack.set(3, "마이콜");
		System.out.println(stack);
		
		for(String k : stack) {
			System.out.println(k);
		}
		System.out.println(stack.size() + "요소가 존재함");
		
		Iterator<String> it = stack.iterator();
		while(it.hasNext()) {
			String msg = (String)it.next();
			System.out.println(msg);
		}
		System.out.println(stack.size() + "요소가 존재함");
		
		while(!stack.isEmpty()) {
			String k = stack.pop();
			System.out.println(k+"삭제, 크기는 " + stack.size() );
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
