package com.ict07.IO;

import java.io.*;

public class Ex17 {
	
	//FileInputStream : read() : int(아스키) -> char형 변환, 대소문자, 숫자만 가능
	//					read(byte[] b), String 이용
	
	
	//FileReader	  : read(): int(유니코드) => char 형변환, 전 서계 문자 처리 가능
	//					read(char[] b),String 이용
	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"study"+File.separator
				+"util"+File.separator+"ict06.txt";
		
		File file = new File(pathname);
		
		FileReader fr = null;
		try {
			fr = new FileReader(file);
			//한글자 읽기
			//int k = fr.read();
			//System.out.println(k + " : " + (char)(k));
			
			//전체 읽기
			/*int k = 0;
			while((k = fr.read()) != -1) {
				System.out.print((char)(k));
			}*/
			
			//char[] 이용
			/*char[] c = new char[(int)file.length()];
			fr.read(c);
			for(char k : c) {
				System.out.print(k);
			}*/
			
			//String 이용
			char[] c = new char[(int)file.length()];
			fr.read(c);
			String str = new String(c);
			System.out.println(str);
			
		} catch (Exception e) {
			
		}finally {
			try {
				fr.close();
				
			} catch (Exception e2) {
				
			}
		}
	}
}
