package com.ict08.network;
import java.util.*;
//ex02 보다 이 방법을 많이 쓴다.
import java.io.*;
import java.net.*;
import java.util.Map;

public class Ex03 {
	public static void main(String[] args) {
		
		BufferedReader br = null;
		try {
			URL url = new URL("https://www.naver.com");
			URLConnection conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
			System.out.println("인코딩 : " + conn.getContentEncoding());
			System.out.println("길이 : " + conn.getContentLength());
			System.out.println("문서타입 : " + conn.getContentType());	
			System.out.println("=========================================");
			
			//HTTP 헤더와 바디로 나뉜다. 
			//헤더의 정보 : HTTP 바디 및 요청/응답에 대한 정보를 포함
			//바디의 정보 : html콛, 이미지, css, javascript
			
			Map<String, List<String>> list = conn.getHeaderFields();
			/*for (Map<String, List<String>> k : list) {
				
			}*/
		} catch (Exception e) {
		}finally {
			try {
				br.close();
			} catch (Exception e2) {
			}
		}
	}
}
