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
		
		double ave = ( sw1 + sw2 + db + lang + sys) / 5.0 ;
		
//		처음 짠 코드 문제 발생(평균이 60점 미만일 경우 과락 과목이 출력되지 않는 오류 발생, 과락 과목 1개 누락포함) 
//		=> 이경우 과락 먼저 코드 작성 후 (과락 과목이 있으면 평균은 비교 하지 않아도 됨 오류 발생줄고, 코드가 깔끔함) 평균 비교 진행하기
//		if (ave >= 60) {
//			if ( sw1 >= 40 && sw2  >= 40 && db >= 40 && lang >= 40 && sys >= 40 ) {
//				System.out.println("합격을 축하합니다!");
//			} else if (sw1 < 40) {
//					System.out.println("소프트웨어설계 과목 과락으로 불합격입니다.");
//			} else if (sw2 < 40) {
//					System.out.println("소프트웨어개발 과목 과락으로 불합격입니다.");
//			} else if (db < 40) {
//					System.out.println("데이터베이스 과목 과락으로 불합격입니다.");
//			} else if (lang < 40) {
//					System.out.println("프로그래밍언어활용 과목 과락으로 불합격입니다.");
//			} else {
//				
//			}
//		} else {
//				System.out.println("평균 점수 60점 미만으로 불합격입니다.");
//		}
		
		if (sw1 < 40) System.out.println("소프트웨어설계 과목 과락으로 불합격입니다.");
		else if (sw2 < 40) System.out.println("소프트웨어개발 과목 과락으로 불합격입니다."); 
		else if (db < 40) System.out.println("데이터베이스 과목 과락으로 불합격입니다.");
		else if (lang < 40) System.out.println("프로그래밍언어활용 과목 과락으로 불합격입니다.");
		else if (sys < 40) System.out.println("정보시스템구출관리 과목 과락으로 불합격입니다.");
		else if (ave >= 60) System.out.println("합격을 축하합니다!");
		else System.out.println("평균 점수 60점 미만으로 불합격입니다.");
	}

}
