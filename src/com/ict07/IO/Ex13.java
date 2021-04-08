package com.ict07.IO;

import java.io.*;

public class Ex13 {
	//DataOutputStream 과 DataInputStream
	//기본 자료형을 주고 받을 때 사용(기본 자료형을 읽고 쓰는 메소드가 별도로 존재)
	//FileInputStream, FileOutputStream과 다른 점은 이진 데이터를 입출력할 때 사용(타 시스템과 입출력할 때 유리)
	//** 입력 순서와 출력순서 다 다르면 데이터의 결과가 달라질 수 있다.
	//BufferedInputStream, BufferedOutputStream을 활용 가능
	public static void main(String[] args) {
		String pathname = "C:"+File.separator+"study"+File.separator
				+"util"+File.separator+"ict03.txt";
		
		File file = new File(pathname);
		
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		DataInputStream dis = null;
		
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);
			
			//쓰기 메소드 : writeXXX(XXX == 기본 자료형)
			dos.writeLong(126L);
			dos.writeBoolean(true);
			dos.writeFloat(3.14f);
			dos.writeInt(256);
			dos.writeDouble(235.41);
			dos.writeChar('A');
			dos.flush();
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			
			//읽는 메소드 : readXXX(상동)
			//들어온 순서대로 안읽으면 다 깨짐. 0, 1 로 이루어진거라서 그럼 어쩔 ㅜㅅ 없음
			System.out.println(dis.readLong());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readFloat());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
		} catch (Exception e) {

		}finally {
			try {
				dos.close();
				bos.close();
				fos.close();
				dis.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {

			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
