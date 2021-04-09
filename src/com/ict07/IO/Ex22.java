package com.ict07.IO;

import java.io.*;
import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 문자 입력 : ");
		String msg = sc.next();
		System.out.println("받은 문자 : " + msg);*/

		//InputStreamRead와 OutputStreamWriter 이용하여 작성
		Scanner sc = new Scanner(System.in);
		//모니터에 출력
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		//키보드를 통해 입력
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			
			bw.write("원하는 문자 입력 : ");
			bw.flush();
			
			String msg = br.readLine();
			bw.write("받은 문자 : " + msg);
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				isr.close();
				bw.close();
				osw.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
		
	}

}
