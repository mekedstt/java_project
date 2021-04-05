package com.ict03.class01;

public class Ex09 {
	private String name;
	private int sum;
	private double avg;
	private String hak;
	private int rank = 1;
	
	
	public void p_sum(int kor, int eng, int math)
	{
		this.sum = kor + eng + math;
		p_avg();
		p_hak();
	}
	
	
	public void p_avg() {
		avg = (int)(sum / 3.0 * 10) / 10.0;
	}
	
	public void p_hak() {
		if(avg>=90)
		{
			hak = "A학점";
		} else if(avg>=80)
		{
			hak = "B학점";
		} else if(avg>=70)
		{
			hak = "C학점";
		} else 
		{
			hak = "F학점";
		}
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSum() {
		return sum;
	}
	
	public double getAvg() {
		return avg;
	}
	
	public String getHak() {
		return hak;
	}
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
}
