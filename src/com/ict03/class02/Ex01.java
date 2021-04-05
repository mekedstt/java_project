package com.ict03.class02;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String str1 = "abc";
		
		char[] data = {'a','b','c'};
		String str2 = new String(data);
		
		byte[] data2 = {97,98,99};
		String str3 = new String(data2);
		
		String str4 = new String("abc");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println();
		
		System.out.println("============");
		String msg = "한국 ICT 인재 개발원 1강의장";
		char c1 = msg.charAt(7);
		
		System.out.println(msg.length());
		for (int i = 0; i < msg.length(); i++) {
			char c2 = msg.charAt(i);
			if(c2 >= 'a' && c2 <= 'z')
			{
				c2 = (char)(c2-32);
			}
		}
		System.out.println(c1);
		System.out.println("=============================");
	
		String s1 = "Korea";
		String s2 = "KOREA";
		String s3 = new String("Korea");
		String s4 = new String("Korea");
		
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println();
		
		
		
		s1 = "seoul";
		s2 = "seoul";*/
	
	//6. format(String format, Object... args) : static String
		
		System.out.println("=============================");
		String msg4 = "한국 ICT 인재 개발원";
		int s5 = 14;
		double s6 = 89.167;
		
		String msg5 = msg4.format("%s의 시작년도는 %d년이고 평균 점수는 %.2f이다.",msg4,s5,s6);
		System.out.println(msg5);
	
	//getBytes 문자열을 byte[]로 변경 보통 입출력할 때 사용
	System.out.println("=============================");
		
	//8. toCharArray();
		
	String msg8 = "자바 8 java8 大韓民國 123";
	char[] c = msg8.toCharArray();
	
	for (int i = 0; i < c.length; i++) {
		System.out.print(c[i]);
	}
	
	String msg9 = new String(c);
	System.out.println(msg9);
		
	//indexOf(int ch) : int
	//문자를 받아 해당 문자의 위치값을 표시
	//문자 없으면 -1
	
	//10. indexOf(int ch, int fromIndex) : int
	
	//11.indexOf(String str) : int
	//문자열을 받아서 해당 문자열의 위치값을 표시
	//시작 위치는 처음부터, 찾는 문자가 없으면 -1
	System.out.println("=============================");
	String msg10 = "BufferedReader";
	int k1 = msg10.indexOf('e');
	System.out.println(k1);

	int k2 = msg10.indexOf('e', msg10.indexOf('e')+1);
	System.out.println(k2);
	
	int k3 = msg10.indexOf('e',msg10.indexOf('e', msg10.indexOf('e')+1))+1;
	System.out.println(k2);
	
	
	k1 = msg10.indexOf('A');
	System.out.println(k1);
	
	boolean b1 = msg10.contains("A");
	System.out.println(b1);
	//String 으로 찾기
	
	k1 = msg10.indexOf("er");
	System.out.println(k1);
	
	k1 = msg10.indexOf("er", msg10.indexOf("er"));
	System.out.println(k1);
	
	
	//11. lasgIndexOf(int ch) : int 
	
	k1 = msg10.lastIndexOf('e');
	System.out.println(k1);
	k1 = msg10.lastIndexOf("er");
	System.out.println(k1);
	
	
	//12. isEmpty() : boolean
	// 문자열의 길이가 0이면 true, 아니면 false
	
	String msg11 = "";
	String msg12 = "java";
	
	System.out.println(msg11.isEmpty());
	System.out.println(msg12.isEmpty());
	
	System.out.println(msg11.length());
	System.out.println(msg12.length());
	
	
	//14.replace(char oldChar, char newChar) : String
	//   replace(String target, String replacement) : String
	//치환
	
	String msg13 = "대한민국";
	String msg14 = msg13.replace("대한민국", "Korea");
	String msg15 = msg13.replace('한', '韓');
	String msg16 = msg13.replace(msg13, "Korea");
	
	System.out.println(msg14);
	System.out.println(msg15);
	System.out.println(msg16);
	
	// 15. 
	
	String msg17 = "사과,딸기,망고,오렌지,파인애플";
	String[] res = msg17.split(",");
	System.out.println(res[0]);
	System.out.println(res[1]);
	System.out.println(res[2]);
	System.out.println(res[3]);
	
	String[] res2 = msg17.split(",",3);
	System.out.println(res2[0]);
	System.out.println(res2[1]);
	System.out.println(res2[2]);
	
	String[] res3 = msg17.split(",",10);
	
	for(int i = 0;i<res3.length;i++)
	{
		System.out.println("i = " + i + ", res = " + res3[i]);
	}
	
	String msg18 = "010-7979-9999";
	String res4 = msg18.substring(4);
	String res5 = msg18.substring(4,8);
	
	
	
	//trim() : String 해당 문자열의 앞, 뒤있는 공백 제거, 중간은 안됨
	
	boolean p1 = true;
	char p2 = 'd';
	int p3 = 100;
	long p4 = 100L;
	float p5 = 100.0f;
	double p6 = 100.0;
	
	System.out.println(p2+1);
	System.out.println(p3+1);
	System.out.println(p4+1);
	System.out.println(p5+1);
	System.out.println(p6+1);
	
	System.out.println(String.valueOf(p1)+1);
	System.out.println(String.valueOf(p2)+1);
	System.out.println(String.valueOf(p3)+1);
	System.out.println(String.valueOf(p4)+1);
	System.out.println(String.valueOf(p5)+1);
	System.out.println(String.valueOf(p6)+1);
	
	
	
	String msg = "true";
	
	boolean a1 = Boolean.parseBoolean(msg);
	if(a1) {
		System.out.println("변경성공");
	}
	
	msg = "100";
	int a2 = Integer.parseInt(msg);
	System.out.println(a2+10);
	
	msg = "3.14";
	double a3 = Double.parseDouble(msg);
	System.out.println(a2+10);
	
	String jumin = "950403";
	String gender = "1";
	
	String year = jumin.substring(0,2);
	
	int y_year = Integer.parseInt(year);
	
	if(gender.equals("1") || gender.equals("2")) {
		y_year += 1900;
	}else if (gender.equals("3") || gender.equals("4")){
		y_year += 2000;
	}
	
	
	int age = 2021 - y_year + 1;
	
	System.out.println("나이는 " + age + "입니다. ");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
