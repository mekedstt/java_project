package com.ict03.class03;

public class Ex15 extends Ex14{
	String name = "全老痢";
	int id = 2410;
	public Ex15() {
		super("老瘤概",27);
		name = "全滴膊";
		id = 1004;
	}
	
	public Ex15(String name) {
		super("褥", 37);
		this.name = name;
	}
	
	
	public void prn() {
		String name = "全矫";
		System.out.println("瘤开 + " + name);
		System.out.println("傈开 + " + this.name);
		System.out.println("何葛 + " + super.name);
		
		System.out.println("瘤开 + " + age);
		System.out.println("傈开 + " + this.age);
		System.out.println("何葛 + " + super.age);
		
		System.out.println("瘤开 + " + id);
		System.out.println("傈开 + " + this.id);
		//System.out.println("何葛 + " + super.id); 给靖
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
