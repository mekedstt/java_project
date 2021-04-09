package com.ict07.IO;

import java.io.*;
//이건가 11번인가 시험 문제라했는데 기억이 안남
public class Ex12 {
	// c:\\study\\util\\java_1.png 파일을 
	// c:\\study\\util\\res안에 이동하는 코딩
	public static void main(String[] args) {
		//읽는 위치
		String pathname1 = "C:"+File.separator+"study"+File.separator
				+"util"+File.separator+"java_2.png";
	
		File read_file = new File(pathname1);
		
		//쓰는 위치
		String pathname2 = "C:"+File.separator+"study"+File.separator
				+"util"+File.separator+"res"+File.separator+"java_2.png";
	
		File wirte_file = new File(pathname2);
		
		
		//먼저 읽어서 쓰기
		//inputStream
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		//OutputStream
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(read_file);
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(wirte_file);
			bos = new BufferedOutputStream(fos);
			
			//그림, 소리, 동영상 파일들을 처리할 때는 무조건 1byte씩 처리해야댐
			int k = 0;
			//1byte 읽기
			while((k = bis.read()) != -1) {
				//1byte 쓰기
				bos.write(k);
			}
			bos.flush();
			
		} catch (Exception e) {
			
		}finally {
			try {
				
				bos.close();
				fos.close();
				bis.close();
				fis.close();
				//읽은 파일 삭제. 파일이 열려있으면 삭제 안됨.라기보다 해당 파일에 대한 모든 작업 안먹힘 아마도
				read_file.delete();
			} catch (Exception e2) {
				
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}
