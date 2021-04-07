package com.ict06.Thread;

/*
문제 : 두 개의 스레드를 생성하여 첫번 째 스레드의 출력을 1 ~ 100까지 출력하고, 두 번째 스레드의 출력은 101부터 200까지 출력
(synchronized 사용)
*/
public class Ex15 implements Runnable{
	int x = 0;
	@Override
	public synchronized void run() {
		
		for(int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (++x));
		}
	}
	
}
