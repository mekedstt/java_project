package com.ict06.Thread;

//스레드 start() => run() 이동해야 스레드 처리가 됨
//     start() => start() 스레드 아님
//     run() => run() 스레드 아님

//스레드 실행 = Thread 클래스를 상속, Runnable 인터페이스 상속
//스레드 클래스는 start(), run() 모두 가짐
//Runnable은 run() 하나 뿐임

public class Ex03 extends Thread{
	
	public void go(){
		for(int i = 1; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
	
	@Override
	public void run(){
		for(int i = 1; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}
	/*@Override
	public void start(){
		for(int i = 1; i < 11; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	}*/ // 이거 있으면 스레드 아님 (같은 이름이 우선이라서 그렇다. 메인에서 start가 나오면 run으로 가야하는데 여기로 와서 스레드가 아니게 됨
}
