package sec01.quiz;

import java.util.Scanner;

public class Quiz2 {
//	Quiz
//	실행 클래스의 deleteChar 메소드를 구현하시오
//	deleteChar(원본문자열, 삭제문자열) 메소드는 원본 문자열에서 삭제 문자열에 속한 문자를 제거하고 
//	남는 문자열을 리턴하는 메소드입니다.
//	※ 참고: 정적(static) 메소드 안에서 인스턴스 메소드를 쓸 수 없습니다.
//	
//	[입력]
//	1) 1,2-3 ,-!
//	2) 1a2b3 12345
//
//	[출력]
//	1) 123
//	2) ab
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		deleteChar(str1, str2);
						
		private static void deleteChar(String str1, String str2) {
			// TODO Auto-generated method stub
			
		}
		
//		String str = "1,2-3";
//		String delete = ",-!";
//		
//		String result = "";
//		
//		for (int i = 0; i < str.length(); i++) {
//			if (str.indexOf(delete.charAt(i)) != -1) {
//				result += str.charAt(i);
//			} 
//		}
//		System.out.println(result);
//		
//		
//		
		
	}

}
