package com.ict10.jdbc;

import java.sql.*;

public class Ex02 {
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
			
			//String sql = "select * from book where bookid = ?";
			//String sql = "select * from book where publisher like ?";
			String sql = "insert into book values(?,?,?,?)";
			
			//뒤의 물음표를 조건으로 바꾸는 것은 excuteQuery문 위에서 한다.= 바인딩 변수 처리 부분
			
			//쿼리 구문 적용
			pstmt = conn.prepareStatement(sql);
			
			//바인딩 변수 처리
			
			//pstmt.setInt(1, 3);
			//pstmt.setString(1, "%이상%");
			pstmt.setInt(1, 15);
			pstmt.setString(2, "농구 바이블");
			pstmt.setString(3, "대한미디어");
			pstmt.setInt(4, 13000);
			
			//실제 DB에 적용하고 결과 받기
			//rs = pstmt.executeQuery();
			//쿼리문이 select 문이면 excuteQuery(). select문이 아니라면 executeUpdate()
			result = pstmt.executeUpdate();
			
			/*while(rs.next()) {   //여긴 select일 때 
				System.out.print(rs.getInt("bookid") + "\t");
				System.out.print(rs.getString("bookname") + "\t");
				System.out.print(rs.getString("publisher") + "\t");
				System.out.println(rs.getInt("price"));
			}*/
			
			//결과 확인
			if(result > 0) {
				
				sql = "select * from book order by bookid asc";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					System.out.print(rs.getInt("bookid") + "\t");
					System.out.print(rs.getString("bookname") + "\t");
					System.out.print(rs.getString("publisher") + "\t");
					System.out.println(rs.getInt("price"));
				}				
			}
			else {
				System.out.println("이미 있다.");
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
