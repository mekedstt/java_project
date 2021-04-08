package com.ict07.IO;

import java.io.File;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		//작업할 특정 위치 지정 및 파일까지 지정. 근데 그 파일이 없다
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + 
										File.separator + "io_test.txt";
		
		File file = new File(pathname);
		
		try {
			boolean b1 = file.createNewFile();//해당 파일 없으니까 생성.
			if(b1) {
				System.out.println("파일 생성 성공");
			}else {
				System.out.println("파일 생성 실패, 같은 이름의 파일이 있는 지 확인.");
				//2번 째 실행부터는 이미 만들어져서 실패(== 같은 이름이 있으면 안되니까)
			}
			
			pathname = "C:" + File.separator + "study" + File.separator + "util" + 
					File.separator + "IO_Test";
			
			File file2 = new File(pathname);
			boolean b2 = file2.mkdirs();
			if(b2) {
				System.out.println("디렉토리 생성 성공");
			}else {
				System.out.println("디렉토리 생성 실패");
			}
			
			//디렉토리 삭제(비어있어야 가능하다.)
			File file3 = new File(pathname);
			boolean b3 = file3.delete();
			if(b3) {
				System.out.println("디렉토리 삭제 성공");
			}else {
				System.out.println("디렉토리 삭제 실패(없거나 비어있지 않거나)");
			}
			
			//파일 삭제
			pathname = "C:" + File.separator + "study" + File.separator + "util" + 
					File.separator + "IO_Test" + File.separator + "sdfsd.txt"; 
			File file4 = new File(pathname);
			boolean b4 = file4.delete();
			if(b4) {
				System.out.println("파일 삭제 성공");
			}else {
				System.out.println("파일 삭제 실패");
			}
			
			//경로 표시
			pathname = "C:" + File.separator + "study" + File.separator + "util";
			File file5 = new File(pathname);
			System.out.println(file5.getAbsolutePath());
			System.out.println(file5.getPath());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		

	}

}
