package com.ict07.IO;

import java.io.*;

public class Ex26_Output {

	public static void main(String[] args) {
		
		
		String pathname = "C:"+File.separator+"study"+File.separator
				+"util" + File.separator + "ict10.ser";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			Ex26_VO vo = new Ex26_VO("�±Ǻ���", 42, 197.2, true);
			oos.writeObject(vo);
			oos.flush();
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}

	}

}
