package com.ict09.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		//데이터를 받아서 VO에 넣는다.
		Scanner sc = new Scanner(System.in);
		ArrayList<VO> list = new ArrayList<VO>();
		
		
		
		
		
		//db에 필요한 3개의 클래스
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null; //Select문의 결과를 받는다.
		int result = 0;
		try {
			//1. 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. 접속을 위한 정보(3개)
			String url = "jdbc:mysql://203.236.220.111:3306/test02db?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "test02";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			//db밖임
			esc:while (true) {
				System.out.print("학번 : ");
				int no = sc.nextInt();
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("학과 : ");
				String det = sc.next();
				System.out.print("주소 : ");
				String addr = sc.next();
				System.out.print("전화 : ");
				String tel = sc.next();
				
				//받은 정보 저장
				list.add(new VO(no, name, det, addr, tel));
				while(true) {
					System.out.println("계속할까요?(y/n)");
					String msg = sc.next();
					if(msg.equalsIgnoreCase("y")) {
						continue esc;
					}
					else if(msg.equalsIgnoreCase("n")) {
						break esc;
					}
					else {
						continue;
					}
				}
			}
			
			for(VO vo : list) {
				String sql = "insert into student_db(no,name,det,addr,tel) "
						+ "values("+vo.getNo()+",'"+vo.getName() +"','"+
						vo.getDet() +"','"	+ vo.getAddr()+"','"+ vo.getTel()+"')";
				stmt = conn.createStatement();
				result = stmt.executeUpdate(sql);
				System.out.println(sql);
				if(result < 0) {
					System.out.println("무언가 잘못됨");
				}
			}
			
			//3. 쿼리문 작성
			//cust id가 7인 사람의 이름 = 박찬호, 주소 = 대한민국 서울 로 변경
			String sql = "select * from student_db";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getString("No") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getString("det") + "\t");
				System.out.print(rs.getString("addr") + "\t");
				System.out.println(rs.getString("tel") + "\t");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
}
