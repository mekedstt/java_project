package com.ict01.grammar.day03;

class Ex10{

	public static void main(String[] args) {
		
		//k1이 60이상이면 합격 아니면 불합격
		int k1 = 76;
		String res1 = "불합격";
		if(k1 >=60)
			res1 = "합격";
		System.out.println(res1);

		//k2가 홀수인지 짝수인지 판별
		int k2 = 25;
		String res2 = "";
		if(k2 % 2 == 1){
			res2 = "홀수";
		} else {
			res2 = "짝수";
		}
		System.out.println(res2);
		//대문자 소문자 판별
		char k3 = 'E';
		String res3 = "";
		if(k3>='A' && k3 <= 'Z') {
			res3 = "대문자";
		} else {
			res3 = "소문자";
		}
		System.out.println(res3);		
		
		//k4 가 1또는 3이면 남자 아니면 여자
		int k4 = 3;
		String sex ="";
		if(k4 == 3 || k4 == 1) {
			sex = "남자";
		} else{
			sex = "여자";
		}
		System.out.println(sex);
		

		//근무시간 ~ 8720, 8시간 초과 시 1.5배 10시간일 때 얼마?
		
		int time = 10;
		int pay;
		if(time > 8) {
			pay = (time - 8) * 8720 * 15 / 10 + 8 * 8720;
		} else {
			pay = time * 8720;
		}
		System.out.println(pay);		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

}