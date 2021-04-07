package com.ict06.Thread;

public class Ex09_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex07 t1 = new Ex07();
		Ex08 t2 = new Ex08();
		Ex09 t3 = new Ex09();
		
		//t1.start(); 오류남. 왜? Runnable과 Ex07,08,09에 start메소드가 없어서.
		
		
		
		
		//Thread thread1 = new Thread();//이놈은 start메소드 있음. 타겟이 없으니 이 기본 생성자를 쓰지 않음.
		Thread thread1 = new Thread(t1);//타겟이 있는 t1
		
		thread1.start();
		
		new Thread(t2).start();
		
		Thread thread3 = new Thread(t3);
		thread3.start();
		
		new Thread(new Runnable() {//익명 내부클래스
			@Override
			public void run() {
				while(true) {
					System.out.println(Thread.currentThread().getName() + "ㅁㅁㅁㅁㅁㅁㅁㅁㅁ");
				}
			}
		}).start();
		
	}
}
