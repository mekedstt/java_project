package com.ict11.ojdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;


public class Ex03 {
	public static void main(String[] args) {
		//삭제 bookid를 받기 위해서 Scanner 사용
		Scanner sc = new Scanner(System.in);
		
		
		esc:while(true) {			
			DAO.getInstance().getList();
			System.out.println("============================================");
			System.out.println("다음을 선태갛세요");
			System.out.println("1. 삽입");
			System.out.println("2. 삭제");
			System.out.println("3. 수정");
			System.out.println("4. 검색");
			System.out.print("선택 번호 : ");
			String su = sc.next();
			switch(su) {
				case "1" :
					System.out.print("bookid : ");
					int i_bookid = sc.nextInt();
					System.out.print("bookname : ");
					String i_bookname = sc.next();
					System.out.print("pbulisher : ");
					String i_publisher = sc.next();
					System.out.print("price : ");
					int i_price = sc.nextInt();

					DAO.getInstance().getInsert(i_bookid, i_bookname, i_publisher, i_price);
					break;
				case "2" : 
					System.out.print("삭제를 원하는 bookid 입력 : ");
					int d_bookid = sc.nextInt();
					
					DAO.getInstance().getDelete(d_bookid);
										
					break;
				case "3" : 
					System.out.print("bookname : ");
					String u_bookname = sc.next();
					System.out.print("pbulisher : ");
					String u_publisher = sc.next();
					System.out.print("price : ");
					int u_price = sc.nextInt();
					System.out.print("target_bookid : ");
					int u_target_bookid = sc.nextInt();
					DAO.getInstance().getUpdate(u_bookname, u_publisher, u_price, u_target_bookid);
					
					break;
				case "4" : 
					System.out.print("검색를 원하는 bookid 입력 : ");
					int s_bookid = sc.nextInt();
					DAO.getInstance().getSelect(s_bookid);
					break;
				default : 
					System.out.println("1~4 중에서 고르시오"); 
					continue esc;					
			}
			while(true) {
				System.out.println("계속 할까요?(y/n)");
				String msg = sc.next();
				if(msg.equalsIgnoreCase("y")) {
					continue esc;
				}else if(msg.equalsIgnoreCase("n")) {
					break esc;
				}else {
					continue;
				}
			}
		}
		System.out.println("변경된 내용 확인");
		DAO.getInstance().getList();
	}
}
