package com.ict03.class07;

abstract class Car {
	abstract void run();
	
	
}

class Bus extends Car {
	@Override
	public void run() {
		System.out.println("80km로 달린다.");
	}
}

class Taxi extends Car {
	@Override
	public void run() {
		System.out.println("160km로 달린다.");
	}
}

class Ex05{
	public void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
		System.out.println();
		
		Car car = new Taxi();
		car.run();
		System.out.println();
		
		Car car2 = new Car() {
			@Override
			void run() {
				System.out.println("무조건 달린다.");
			}
		};
		car2.run();
	}
}
