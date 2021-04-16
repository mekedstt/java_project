package com.ict07.IO;


import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Ex26_VO implements Externalizable{

	private String name;
	private int age;
	private double weight;
	private boolean gender;
	
	public Ex26_VO() {}
	
	public Ex26_VO(String name, int age, double weight, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}
	
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// 직렬화 대상을 입력
		out.writeObject(name);
		out.writeObject(age);
		//out.writeObject(weight);
		out.writeObject(gender);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// 역직렬화 대상을 입력
		name = (String)in.readObject();
		age = (int)in.readObject();
		//weight = (double)in.readObject();//지울꺼면 둘 다 지워야됨
		gender = (boolean)in.readObject();
		
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	
}
