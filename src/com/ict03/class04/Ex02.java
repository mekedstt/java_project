package com.ict03.class04;

//일반적인 클래스가 추상 클래스를 상속하려면 반드시 추상 클래스의 추상 메소드를 오버라이디 ㅇ해야함
//==구체화 해야한다.
class Ex02 extends Ex01{
	@Override
	public void sound() {
		
	}
	
}

//오버라이딩을 하지 않으려면 자식클래스가 추상 클래스로 만들면 됨.
abstract class Ex03 extends Ex01{
	public void song() {
		System.out.println("노래하기");
	}
	
}
//오버라이딩을 하지 않으려면 자식클래스가 추상 클래스로 만들면 됨.
abstract class Ex04 extends Ex01{
	public void music() {
		System.out.println("음악");
	}
	public abstract void pop();
	
}

