package com.ict06.Thread;

/*
	문제 : 두 개의 스레드를 생성하여 첫 번째 스레드의 출력을 1 ~ 50까지 출력, 두 번째 스레드의 출력을 51 ~ 100까지 출력
	다시 첫 번째 스레드가 101부터 150까지 출력 두 번째 스레드가 151 ~ 200까지 출력
*/
public class Ex16 implements Runnable{
	int x = 0;
	@Override
	public synchronized void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (++x));
			if(x == 50 || x == 100) {
				try {
					//System.out.println("왜 안나와");
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else  {
				notify();
			}
		}
	}
}
