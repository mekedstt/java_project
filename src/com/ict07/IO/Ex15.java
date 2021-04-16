package com.ict07.IO;

import java.io.*;

public class Ex15 {
	//문자 스트림(사람 중심) : 모든 처리를 2byte씩 처리
	//대상 : 전 세계 모든 언어로 구성된 문서 파일들
	//최상위 클래스 : Reader(입력), Writer(출력) .....?
	
	//FileOutputStream(바이트)	: 1byte 처리, write(int b), wirte(byte[] b) 
	//FileWriter(문자)			: 2byte 처리, write(int b), write(char[] b), write(String str)
	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"study"+File.separator
				+"util"+File.separator+"ict05.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			
			
			//한글자 쓰기
			fw.write(97);
			fw.write(65);
						
			fw.write('J');
			fw.write('A');
			fw.write('V');
			fw.write('A');
			fw.write('대');			
			fw.write('한');			
			fw.write('J');
			fw.write('A');
			fw.write('V');
			fw.write('A');		
			fw.write('\n');		
			
			char[] c = {'k','o','r','e','a','=','대','한','민','국','\n'};
			
			fw.write(c);
			
			fw.write("시발 언제 끝나냐\n");
		} catch (Exception e) {
			
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
				
			}
		}
	}

}
