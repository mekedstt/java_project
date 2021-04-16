package com.ict07.IO;


import java.io.*;

public class pratice {

	public static void main(String[] args) {
		String pathname1 = "C:" + File.separator + "study" + File.separator + "util" + 
								File.separator + "Lancer.jpeg";
		String pathname2 = "C:" + File.separator + "study" + File.separator + "util" + 
				File.separator + "res" + File.separator + "Lancer.jpeg";
		
		File read_file = new File(pathname1);
		File write_file = new File(pathname2);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(read_file);
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(write_file);
			bos = new BufferedOutputStream(fos);
			
			int k = 0;
			while((k = bis.read()) != -1) {
				bos.write(k);
			}
			bos.flush();
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
				read_file.delete();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
		
		
		

	}

}
