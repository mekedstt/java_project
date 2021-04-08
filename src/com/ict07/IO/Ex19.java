package com.ict07.IO;

import java.io.*;
import java.util.*;

public class Ex19 {

	public static void main(String[] args) {
		//복사 장소와 파일명을 받고 붙이기 장소와 파일명을 받아서 붙이기 하자.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("복사할 파일의 경로 : ");
		String copy_path = sc.next();
		System.out.print("복사할 파일의 이름 : ");
		String copy_file = sc.next();
		
		System.out.print("복사한 파일의 저장 경로 : ");
		String paste_path = sc.next();
		System.out.print("복사한 파일의 저장 이름 : ");
		String paste_file = sc.next();
		
		
		File c_file = new File(copy_path + "\\" + copy_file);
		File p_file = new File(paste_path + "\\" + paste_file);
		
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		try {
			//읽기
			fr = new FileReader(c_file);
			br = new BufferedReader(fr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg = br.readLine()) != null) {
				sb.append(msg + "\n");
			}
			//쓰기
			fw = new FileWriter(p_file);
			bw = new BufferedWriter(fw);
			
			//bw.write(sb.toString());
			String str = sb.toString();
			str.replace("대한민국", "大韓民國");
			bw.write(sb.toString());
			
			bw.flush();
		} catch (Exception e) {
			
		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch (Exception e2) {
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
