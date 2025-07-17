package sec02.exam11;

import java.util.Scanner;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		
		// 값이 오는 자리에 연산식이 올 수도 있음
		char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' ) ;
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
		Scanner sc = new Scanner(System.in);
		
		score = sc.nextInt();
//		System.out.println(score);
		String grade1 = (score < 100 && score >= 60) ? "합격" : ( (score > 100 || score < 0) ? "점수입력오류" : "불합격");
		// 100점 미만이면서 60점 이상인 경우 '합격', 100점 초과이거나 0점 미만인경우 점수입력오류, 그외 불합격(0~60까지)
		System.out.println(grade1);
				
				
	}

}
