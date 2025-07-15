package sec03.exam01; // 패키지 선언 : 해당 소스파일이 sec03.exam01 패키지 밑에 있음

// 주석 사용하기 ( Ctrl + / 라인주석)
//  출력문, 여기에는 모두 주석이 됩니다.
/* 주석 어려줄 사용하기 ( Ctrl + Shift + / 범위주석 )
주석1
주석2
*/
/**
 도큐먼트 주석
 * 
 */
public class Hello { // 클래스 선언 : 클래스 이름은 대문자로 시작하고 반드시 소스 파일의 이름과 동일
	
	// 프로그램 실행 진입점
	public static void main(String[] args) { // main 메소드 선언 : 자바 프로그램 실행시 가장 먼저 실행되는 메소드
		// 콘솔에 출력하는 실행문
		System.out.println("Hello, Java");
		// 저장을 누를 때마다 자동으로 컴파일됨(만약 에러가 있으면 빨간줄 발생!)
	}

}
