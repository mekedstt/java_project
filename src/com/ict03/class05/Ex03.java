package com.ict03.class05;

/*
 인터페이스 상속
 1. 일반 클래스가 인터페이스를 상속 받을 때 => 무조건 오버라이딩
 2. 추상 클래스가 인터페이스를 상속 받을 때 => 굳이...?
 3. 인터페이스가 인터페이스를 상속하면 -> 오버라이딩 필요 업승ㅁ
 4. 다중 상속 가능. 인터ㅔ이스 자식 extends 인터페이스 부모1, 인터페이스 부모2. ...
 4. 일반 클래스가 부모 클래스와 부모인터페이스를 같이 상속하면
 	class 클래스 이름 extends 부모 클래스 implements 인터페이스
 5. 인터페이스 => 인터페이스, 클래스 => 클래스 : extends 예약어 사용
    클래스 => 인터페이스 : implements 예약어 사용, 인터페이스 => 클래스  못쓴다.
 
 
 
 
 */

public class Ex03 implements Ex01{
	@Override
	public void like() {
		
	}
	@Override
	public void sound() {
		
	}
}

//추상 클래스가 인터페이스를 상속 : 오버라이딩 필요 없음

abstract class Ex04 implements Ex01{
	
}
interface Ex05 extends Ex01{
	
}

