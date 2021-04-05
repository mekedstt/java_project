package com.ict03.class01;

public class Ex02 {
	int k1 = 80; //인스턴스 변수 == 일반 변수
	static int K2 = 90;//static 변수
	final int K3 = 85; // 인스턴스 상수
	static final int K4 = 95; //static 상수 == API에서 제공하는 상수형태
	
	
	//멤버 메소드 : 동작, 기능
	//인스턴스, 반환형이 없다.
	public void prn01() {
		
	}
	
	//static, 반환형이 없다.
	public static void prn02() {
		//지역변수는 static 못쓴데
		/*지역변수 : 메소드 안에서 만들어지는 변수
					메소드 안에서 마들어진 변수는 메소드를 호출할 때 생성
					메소드가 사라지면 사라진다
					지역변수는 static 을 만들 수 없다.*/
	}
	
	//인스턴스, 반환형이 있음
	public int prn03() {
		k1 += 20;
		K2 += 10;
		System.out.println("k1 = " + k1);
		System.out.println("K2 = " + K2);
		
		return k1;
	}
	
	//static 반환형이 있음
	public static double prn04() {
		//static 메소드에는 인스턴스 변수 사용 불가
		//k1 += 20; 오류
		//K3 += 10;오류
		
		return 147;
//		return 0;
	}
	
	
	
	
}
