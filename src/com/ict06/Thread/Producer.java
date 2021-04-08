package com.ict06.Thread;

public class Producer implements Runnable{
	private Car car;
	public Producer(Car car) {
		this.car = car;
	}
	@Override
	public void run() {
		String carName = null;
		for(int i = 0; i < 30; i++) {
			carName = car.getCar();
			car.push(carName);
			try {
				Thread.sleep((int)(Math.random() * 300));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
