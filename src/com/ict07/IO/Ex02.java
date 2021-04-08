package com.ict07.IO;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ex02 {
	public static void main(String[] args) {	
		String pathname_1 = "C:\\study\\util"; //운영체제 windows일 때
		String pathname_2 = "C:/study/util";//운영체제 Linux일 때
		
		//운영체제 관계없이 사용
		String pathname_3 = "C:" + File.separator + "study" + File.separator + "util";
		
		File file = new File(pathname_3);
		String[] arr = file.list();
		
		//날짜 구하기. 날짜형식 지정. 형식 지정이니까 굳이 for문 안에 안넣어도됨 그래서 뺌
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		
		
		for(String k : arr) {
			//System.out.println(k);
			File file2 = new File(pathname_3, k);
			//System.out.println(file2);
			//컴퓨터에 저장할 수 있는 종류는 디렉토리, 파일 뿐
			
			
			if(file2.isDirectory()) {
				System.out.println("디렉토리 : " + file2 + " 크기는 존재하지 않음" + 
									"수정 한 마지막 날짜 : " + sdf.format(file2.lastModified()));
			}else {
				System.out.println("파일 : " + file2 + " 크기 : " + (int)(file2.length() / 1024) + "KB" + 
									"수정 한 마지막 날짜 : " + sdf.format(file2.lastModified()));
			}
		}
	}
		
}


