package com.ict03.class06;


enum Type2{
	//순서 지키자
	//1. 들어갈 정보
	WALK("워킹화",270),
	RUN("러닝화",280),
	TRACK("트래킹화",260),
	HIK("하이킹화",265);
	//2. 전역변수
	final private String name;
	final private int size;
	//3. 생성자
	Type2(String name, int size){
		this.name = name;
		this.size = size;
	}
	//4. getter/setter
	public String getName() {
		return name;
	}
	
	
	public int getSize() {
		return size;
	}
}



public class Ex03 {
	public static void main(String[] args ) {
		Type2[] arr = Type2.values();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName() + ",  " + arr[i].getSize());
		}
		
		//개선된 for == foreach = forin
		//':' 의 의미 => 배열이 가지고 있는 처음부터 끝까지 차례대로 변수에 대입
		//단 배열의 특정한 요소를 처리는 불가능.
		for(Type2 type2 : arr) {
			System.out.println(type2.getName() + " " + type2.getSize());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String[] msg = {"java", "jsp", "spring", "android"};
		for(String k : msg) {
			System.out.println(k);
		}
		
		
	}
}
