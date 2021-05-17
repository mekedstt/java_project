package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04 {
	public static void main(String[] args) {
		//db에 필요한 3개의 클래스
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; //Select문의 결과를 받는다.
		int result = 0;
		try {
			//1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. 접속을 위한 정보(3개)
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "root";
			String password = "a007005618!@";
			conn = DriverManager.getConnection(url, user, password);
			//3. 쿼리문 작성
			//cust id가 7인 사람의 이름 = 박찬호, 주소 = 대한민국 서울 로 변경
			String sql = "delete from customer where name = '손흥민'";
			
			//4.실제 DB에 보낼 준비
			stmt = conn.createStatement();
			
			//5.실제 보내고 결과 받기
			//select문인 것과 아닌것 2개로 나누어짐. 여긴 select문 아니니까 result사용. rs사용은 EX01 참조
			result = stmt.executeUpdate(sql);
			if(result > 0) {
				System.out.println("삭제 성공");
				
				sql = "select * from customer";
				stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getInt("custid") + "\t");
					System.out.print(rs.getString("name") + "\t");
					System.out.print(rs.getString("address") + "\t");
					System.out.println(rs.getString("phone") + "\t");
				}
			}else {
				System.out.println("삭제 실패-1");
			}
		} catch (Exception e) {
			System.out.println("삭제 실패-2");
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
