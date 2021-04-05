package com.ict01.grammar.day04;

class Ex01{ 
	public static void main(String[] args) {
		
		//k1이 A아프리카, B 브라질 C 캐나다 그 외는 한국
		
		
		char k1 = 'C';
		String str = "";
		switch(k1) {

			case 'A' : str = "아프리카"; break;
			case 'B' : str = "브라질"; break;
			case 'C' : str = "캐나다"; break;	
			default : str = "한국";
		}
		System.out.println("결과 : " + str);
		
		//k1이 A,a아프리카, B,b 브라질 C,c 캐나다 그 외는 한국
		
		
		switch(k1) {

			case 'A' :
			case 'a' : str = "아프리카"; break;
			case 'B' : 
			case 'b' : str = "브라질"; break;
			case 'C' :
			case 'c' : str = "캐나다"; break;
			default : str = "한국";
		}
		System.out.println("결과 : " + str);
		
		//int k2 == 1 || 3 남자 2 || 4 여자
		int k2 = 3;
		String str2 = "";
		switch(k2) {
			case 1 : 
			case 3 : str2 = "남자"; break;
			case 2 :
			case 4 : str2 = "여자"; break;
		}
		System.out.println("결과 : " + str2);
		
		
		//k3이 한국이면 서울 중국이면 베이징 일본이면 도쿄	
		String k3 = "한국";
		String str3 = "";
		switch(k3) {

			case "한국" : str3 = "서울";break;
			case "중국" : str3 = "베이징";break;
			case "일본" : str3 = "도쿄";break;
			default : str = "데이터에 없는 나라 입니다.";
		}
		System.out.println("결과 : " + str3);
		
		
	}
}