package com.ict03.class02;


public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "hello";
		System.out.println(msg);
		
		msg += " java";
		System.out.println(msg);
		
		StringBuffer sb = new StringBuffer("welcome");
		System.out.println(sb.toString());
		
		//StringBuffer == 가변의 속성
		//현재 영역에서 내용 추가. String은 +를 할 경우 새로운 영역(메모리)에 저장
		//내용을 추가할 때 append("문자열")
		
		sb.append(" JAVA");
		
		System.out.println(sb.toString());
		
	}

}
