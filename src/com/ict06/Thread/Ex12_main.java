package com.ict06.Thread;

public class Ex12_main {

	public static void main(String[] args) {
		System.out.println("main 시작");
		Ex12 t1 = new Ex12();
		Thread thread1 = new Thread(t1);
		thread1.start();
		
		
		
		//join() : 현재 스레드는 join()을 호출한 스레드가 끝날떄까지 대기상태에 빠져 있다가 join()을 호출한
		//			스레드가 끝나면 다시 실행. 즉 join()을 호출한 스레드가 끝날때까지 실행 할 수 없다.
		//			== 메인이 먼저 끝나버리는 걸 막는다.
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main 끝");

	}
}
