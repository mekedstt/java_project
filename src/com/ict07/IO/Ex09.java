package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex09 {
// c:\\study\\util\\test100.txt 파일 안에
		/*
		 * 이름 : ---
		 * 나이 : --
		 * 전화번호 : 000-0000-0000
		 * 작성하는 코딩
		 */
	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"study"+File.separator
				+"util"+File.separator+"test100.txt";
		
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			String msg = "이름 : 최지우\n나이 : 27\n전화번호 : 010-5096-4105";
			
			byte[] b = msg.getBytes();
			fos.write(b);
			fos.flush();
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		

	}

}
