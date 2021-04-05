package com.ict03.class05;

public interface Ex01 {
	/*인터페이스는 : 서비스를 제공하는 목록과 같은 것
				상수와 추상메소드들로 이루어짐
				생성자 x -> 실제 사용 못함 -> 다중 상속 가능
				실제 사용하기 위해서는 인터페이스를 상속받은 클래스가 있고
				상속 받은 클래스를 사용하는 것.	
	인터페이스가 같다 라는 말은 대체(호환)이 가능하다 라는 뜻
	*/
	
	//이것들 다 상수다.
	final int su1 = 10;
	static final int su2 = 20;
	int su3 = 30;
	static int su4 = 40;
	
	
	//추상 메소드가 아니면 못 쓴다.
	public abstract void like() ;
	
	//인터페이스 안에서는 예약어 굳이 안써도 됨
	public void sound();
}
