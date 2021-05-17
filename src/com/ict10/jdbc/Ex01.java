package com.ict10.jdbc;

import java.sql.*;

public class Ex01 {
	public static void main(String[] args) {
		//JDBC는 자바에서 데이터베이스에 접속 할 수 있도록 지원하는 자바 API
		
		//DB 처리에 필요한 클래스 3개
		Connection conn = null;
		//Statement 를 상속받은 인터페이스
		PreparedStatement pstmt = null;
		ResultSet rs = null;     //select문의 결과를 받은 클래스로 cursor를 사용해서 정보를 추출할 수 있다.
		int result = 0;
		try {
			//1. 드리이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. 접속 정보 (3개)
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=utf-8&serverTimezone=UTC";
			String user = "root";
			String password = "a007005618!@";
			conn = DriverManager.getConnection(url, user, password);
			
			//쿼리문 작성(select, insert, update, delete)
			String sql = "select * from book order by bookid";
			
			//쿼리 구문 적용
			pstmt = conn.prepareStatement(sql);
			
			//실제 DB에 적용하고 결과 받기
			rs = pstmt.executeQuery();
			
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
				
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
