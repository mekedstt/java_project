package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.*;

public class Ex10 {
// c:\\study\\util\\test100.txt 파일 안에 내용 읽기
		
	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"study"+File.separator
				+"util"+File.separator+"test100.txt";
		
		File file = new File(pathname);
		FileInputStream fos = null;
		BufferedInputStream bos = null;
		
		try {
			fos = new FileInputStream(file);
			bos = new BufferedInputStream(fos);
			
			
			byte[] b = new byte[(int) file.length()];
			fos.read(b);
			String str = new String(b);
			System.out.println(str);
			
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
