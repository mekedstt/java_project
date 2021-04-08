package com.ict07.IO;

import java.io.File;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		//�۾��� Ư�� ��ġ ���� �� ���ϱ��� ����. �ٵ� �� ������ ����
		String pathname = "C:" + File.separator + "study" + File.separator + "util" + 
										File.separator + "io_test.txt";
		
		File file = new File(pathname);
		
		try {
			boolean b1 = file.createNewFile();//�ش� ���� �����ϱ� ����.
			if(b1) {
				System.out.println("���� ���� ����");
			}else {
				System.out.println("���� ���� ����, ���� �̸��� ������ �ִ� �� Ȯ��.");
				//2�� ° ������ʹ� �̹� ��������� ����(== ���� �̸��� ������ �ȵǴϱ�)
			}
			
			pathname = "C:" + File.separator + "study" + File.separator + "util" + 
					File.separator + "IO_Test";
			
			File file2 = new File(pathname);
			boolean b2 = file2.mkdirs();
			if(b2) {
				System.out.println("���丮 ���� ����");
			}else {
				System.out.println("���丮 ���� ����");
			}
			
			//���丮 ����(����־�� �����ϴ�.)
			File file3 = new File(pathname);
			boolean b3 = file3.delete();
			if(b3) {
				System.out.println("���丮 ���� ����");
			}else {
				System.out.println("���丮 ���� ����(���ų� ������� �ʰų�)");
			}
			
			//���� ����
			pathname = "C:" + File.separator + "study" + File.separator + "util" + 
					File.separator + "IO_Test" + File.separator + "sdfsd.txt"; 
			File file4 = new File(pathname);
			boolean b4 = file4.delete();
			if(b4) {
				System.out.println("���� ���� ����");
			}else {
				System.out.println("���� ���� ����");
			}
			
			//��� ǥ��
			pathname = "C:" + File.separator + "study" + File.separator + "util";
			File file5 = new File(pathname);
			System.out.println(file5.getAbsolutePath());
			System.out.println(file5.getPath());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		

	}

}