package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {
		/* �ӵ� ����� ���ؼ� BufferedInputStream�� ����Ѵ�.
		 * ȥ�ڼ��� ����� �� ����, �ݵ�� InputStream�� �޾Ƽ� ����Ѵ�
		 * -������ :  BufferInputStream(InputStream in)
		
		*/
		String pathname = "C:"+File.separator+"study"+File.separator
				+"util"+File.separator+"ict01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			//�ѱ��� �о����
			//int k = bis.read();
			//System.out.println(k + " : " + (char)(k));
			
			//�ѱ��ھ� ��� �б� : �׸�, �Ҹ�, ������ ������ ������ �ش� ����� ���. �� ������� ���ڵ��� ���� �� ����.
			/*int k = 0;
			while(bis.read() != -1) {
				k = bis.read();
				System.out.println(k + " : " + (char)(k));				
			}*/
			/*while((k = bis.read()) != -1) {
				System.out.println(k + " : " + (char)(k));
			}*/
			
			//�迭�� �̿��ϴ� ��� �� ����� ��� ����
			/*byte[] b = new byte[(int) file.length()];
			bis.read(b);
			for(byte k : b) {
				System.out.println(k + " : " + (char)(k));
			}*/
			//String�� �̿����� ���� �̿� ���� ����
			
			byte[] b = new byte[(int) file.length()];
			bis.read(b);
			String str = new String(b);
			System.out.println(str);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}