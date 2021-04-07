package com.ict06.Thread;

public class Ex07 implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName() + "aaaaa");
		}
		
		
	}
}
