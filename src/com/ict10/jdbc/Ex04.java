package com.ict10.jdbc;

import java.sql.*;
import java.util.*;

public class Ex04 {
	public static void main(String[] args) {
		//삭제 bookid를 받기 위해서 Scanner 사용
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("삭제할 id를 입력하시오 : ");
		int del_id = sc.nextInt();
		
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
			
			String sql = "delete from book where bookid = ?";
			
			//뒤의 물음표를 조건으로 바꾸는 것은 excuteQuery문 위에서 한다.= 바인딩 변수 처리 부분
			
			//쿼리 구문 적용
			pstmt = conn.prepareStatement(sql);
			
			//바인딩 변수 처리			
			pstmt.setInt(1, del_id);
			
			//실제 DB에 적용하고 결과 받기			
			result = pstmt.executeUpdate();
			
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
			}else {
				System.out.println("삭제할 항목이 존재하지 않습니다.");
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
