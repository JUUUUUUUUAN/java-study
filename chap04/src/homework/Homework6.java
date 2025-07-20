package homework;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=======합격인가? 불합격인가?========");
		
		System.out.println("각 과목의 점수를 입력하세요.");
		System.out.print("소프트웨어설계 점수: ");
		int sw1 = sc.nextInt();
		System.out.print("소프트웨어개발 점수: ");
		int sw2 = sc.nextInt();
		System.out.print("데이터베이스구축 점수: ");
		int db = sc.nextInt();
		System.out.print("프로그래밍언어활용 점수: ");
		int lang = sc.nextInt();
		System.out.print("정보시스템구축관리 점수: ");
		int sys = sc.nextInt();
		
		int ave = ( sw1 + sw2 + db + lang + sys) / 5 ;
		
		if (ave >= 60) {
			if ( sw1 >= 60 && sw2  >= 60 && db >= 60 && lang >= 60 && sys >= 60 ) {
				System.out.println("합격을 축하합니다!");
			} else if (sw1 < 60) {
					System.out.println("소프트웨어설계 과목 과락으로 불합격입니다.");
			} else if (sw2 < 60) {
					System.out.println("소프트웨어개발 과목 과락으로 불합격입니다.");
			} else if (db < 60) {
					System.out.println("데이터베이스 과목 과락으로 불합격입니다.");
			} else if (lang < 60) {
					System.out.println("프로그래밍언어활용 과목 과락으로 불합격입니다.");
			} else {
				
			}
		} else {
				System.out.println("평균 점수 60점 미만으로 불합격입니다.");
		}
	}

}
