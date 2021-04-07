package com.ict06.Thread;

public class Ex15_main {

	public static void main(String[] args) {
		Ex15 t1 = new Ex15();
		
		new Thread(t1,"dog").start();
		new Thread(t1,"cat").start();

	}

}
