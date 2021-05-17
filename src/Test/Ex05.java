package Test;

import java.io.*;
import java.util.*;

public class Ex05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("복사 장소와 파일명 : ");
		String pathname1 = sc.next();
		System.out.print("붙이기 장소와 파일명 : ");
		String pathname2 = sc.next();
		
		
		File file1 = new File(pathname1);
		File file2 = new File(pathname2);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream(file1);
			bis = new BufferedInputStream(fis);
						
			fos = new FileOutputStream(file2);
			bos = new BufferedOutputStream(fos);
			
			int k = 0;
			while((k=bis.read()) != -1) {
				bos.write(k);
			}
			bos.flush();
			
		} catch (Exception e) {
			
		}finally {
			try {
				bos.close();
				fos.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
	}
}
