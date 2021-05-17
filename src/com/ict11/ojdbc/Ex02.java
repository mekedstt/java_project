package com.ict11.ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		//Scanner를 이용해서 출판사의 정보를 받자.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String msg = sc.next();
		
		
		//DB 처리에 필요한 클래스
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		int result = 0;
		try {
			//1. 드라이버 로딩.
			Class.forName("oracle.jdbc.OracleDriver");
			//2. 접속 정보 (3개)
			String url = "jdbc:oracle:thin:@203.236.220.4:1521:xe";
			String user = "c##ictedu02";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			//쿼리 작성
			String sql = "select * from book where publisher = ? order by bookid";
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, "%" + msg + "%");
			rs = pstm.executeQuery();
			System.out.println("도서번호\t도서명\t출판사\t가격");
			
			while(rs.next()) {
				System.out.print(rs.getInt("bookid") + "\t");
				System.out.print(rs.getString("bookname") + "\t");
				System.out.print(rs.getString("publisher") + "\t");
				System.out.println(rs.getInt("price"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {				
				rs.close();
				pstm.close();
				conn.close();			
			} catch (Exception e2) {
					System.out.println(e2);
			}
		}
	}
}
