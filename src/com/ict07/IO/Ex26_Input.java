package com.ict07.IO;
import java.io.*;

public class Ex26_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pathname = "C:"+File.separator+"study"+File.separator
				+"util" + File.separator + "ict10.ser";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			Ex26_VO vo = (Ex26_VO)ois.readObject();
			System.out.println(vo.getName()); 
			System.out.println(vo.getAge());
			System.out.println(vo.getWeight());
			System.out.println(vo.isGender());
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}

}
