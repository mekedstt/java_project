package com.ict06.Thread;

public class Ex03_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		Ex03 t1 = new Ex03();
		Ex03 t2 = new Ex03();
		Ex03 t3 = new Ex03();
		Ex03 t4 = new Ex03();
		Ex03 t5 = new Ex03();
		t1.go();
		System.out.println("=============수고!==============");
		
		t1.start();//start -> run 이어야 하는데 start 함수가 있어서 run으로 안감 == 스레드가 아님
		System.out.println("=============수고!==============");
		
		
	}

}
