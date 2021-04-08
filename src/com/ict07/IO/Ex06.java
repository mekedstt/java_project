package com.ict07.IO;

import java.io.*;

public class Ex06 {
	public static void main(String[] args) {
		
		//속도향상을 위해서 BufferOutputStream을 사용
		//혼자서는 사용할 수 없고, 반드시 OutputStream을 받아서 사용
		//셍성자 : BufferedOutputStream(OutputStream out)
		
		
		String pathname = "C:"+File.separator+"study"+File.separator
				+"util"+File.separator+"ict02.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			bos.write(65);
			bos.write(97);
			
			bos.write('j');
			bos.write('a');
			bos.write('v');
			bos.write('a');
			
			bos.write(13);
			
			byte[] b = {'H', 'i', 'J', 'A', 'V', 'A', 13};
			bos.write(b);
			
			String str = "Hell\r안녕\r123\r大韓";
			byte[] b2 =str.getBytes();
			bos.write(b2);
			
			bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
