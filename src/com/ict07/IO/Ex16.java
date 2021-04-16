package com.ict07.IO;

import java.io.*;

public class Ex16 {
	//BuffereWrite : 속도 향상을 위해서 사용. 줄바꾸기 메소드 내장
		public static void main(String[] args) {
			String pathname = "C:"+File.separator+"study"+File.separator
					+"util"+File.separator+"ict06.txt";
			
			File file = new File(pathname);
			FileWriter fw = null;
			BufferedWriter bw = null;
			try {
				fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
				//한글자 쓰기
				bw.write(97);
				bw.write(65);
				
							
				bw.write('J');
				bw.write('A');
				bw.write('V');
				bw.write('A');
				bw.write('대');			
				bw.write('한');			
				bw.write('J');
				bw.write('A');
				bw.write('V');
				bw.write('A');		
				bw.write('\n');		
				
				char[] c = {'k','o','r','e','a','=','대','한','민','국','\n'};
				
				bw.write(c);
				
				bw.write("시발 언제 끝나냐\n");
			} catch (Exception e) {
				
			}finally {
				try {
					bw.close();
					fw.close();
					
				} catch (Exception e2) {
					
				}
			}
		}
}
