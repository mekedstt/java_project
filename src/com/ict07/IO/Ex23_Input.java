package com.ict07.IO;

import java.io.*;


//객체의 역직렬화 : ObjectInputStream : readObject()
public class Ex23_Input {
	public static void main(String[] args) {
		//객체 역직렬화 : 직렬화 된 파일이나 정보를 원래 내용으로 복원하는 역할을 함
		String pathname = "C:"+File.separator+"study"+File.separator
				+"util" + File.separator + "ict07.ser";
		File file = new File(pathname);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);//이렇게 연결해서 쓰는 방식 = 체인 방식
			
			//역직렬화
			Ex23_VO vo = (Ex23_VO) ois.readObject();
			System.out.println(vo.getName());
			System.out.println((vo.getAge()));
			System.out.println(vo.getWeight());
			System.out.println((vo.isGender()));
			
		} catch (Exception e) {

		}finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				
			}
		}
		
		
		
		
	}
}
