package com.ict08.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {
	public static void main(String[] args) {
		/* InetAddress : 자바에서 IP 주소를 표현하는 클래스
						 생성자가 존재하지만 사용하지 않는다.	
						 6개의 static  메소드를 이용
			**localhost : 현재 내가 사용하고 있는 컴퓨터를 말함
		*/
		
		
		InetAddress addr;
		try {
			addr = InetAddress.getByName("www.naver.com");
			System.out.println("이름 : " + addr.getHostName());
			System.out.println("주소 : " + addr.getHostAddress());
			System.out.println("toString : " + addr.toString());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
	}
}
