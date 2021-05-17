package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex01 {
	public static void main(String[] args) {
		//JDBC(java database connectivity) : 자바에서 데이터베이스에 접속할 수 있도록 하는 자바 API
		//JDBC는 데이터베이스에서 자료를 쿼리하거나 업데이트 하는 방법을 제공
		//각 데이터베이스들에게 접속할 수 있는 JDBC 드라이버가 필요
		//Mysql에 필요한 드라이버를 다운받아서 해당 프로젝트에 참조해야된다.
		//프로젝트에서 마우스 오른쪽 - Build path - Configure Build Path - Add external jar...
		//해당 라이브러리 선택
		
		//DB처리에 피룡한 클래스 3개 선언
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; //Select문의 결과를 받는다.
		int result = 0; // update, insert delete의 결과
		try {
			// 1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. 접속을 위한 정보(3개)
			//계정 생성시 localhost로 만들면 //localhost/  사용
			String url = "jdbc:mysql://localhost/test01db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "root";
			String password = "a007005618!@";
			conn = DriverManager.getConnection(url, user, password);
			
			//3. 쿼리문 작성 (CRUD = 조작어(insert, update, delete, select)
			String sql = "select * from customer";
			
			//4. 실제 DB에 접속. Statement 클래스에 저장.
			stmt = conn.createStatement();
			
			//5. Statement클래스에 쿼리 저장 후 DB에 결과를 받아서 처리한다.
			//이때 2가지로 나뉘어짐. select문일 때와 아닐 때
			
			//select문일 때는 ResultSet 클래스가 받는다.
			rs = stmt.executeQuery(sql);
			//아닐 때는 int가 받는다.
			//result = stmt.executeUpdate(sql);
			//6. 결과보기 next() => 다음 줄에 정보가 있으면 true
			while(rs.next()) {
				System.out.print(rs.getInt("custid") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getString("address") + "\t");
				System.out.println(rs.getString("phone") + "\t");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				
			}
		}
	}
}
