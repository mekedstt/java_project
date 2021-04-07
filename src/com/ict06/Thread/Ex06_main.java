package com.ict06.Thread;

public class Ex06_main {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());//여기선 Thread를 상속 받지 않아서 Thread.current~ 로 써야함
		Ex04 t1 = new Ex04();
		Ex05 t2 = new Ex05();
		Ex06 t3 = new Ex06();
		
		//t1만 계속 나옴
		/*t1.run();
		t2.run();
		t3.run();*/
		
		
		//스레드 처리는 병렬의 증거
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}

}
