package sec03.exam03.Quiz;

public class Animal {
	String kind;
	int age;
	
	// 종류만 받는 생성자
	Animal (String kind){
		this.kind = kind;
		this.age = 1;
	}
	
	// 나이만 받는 생성자
	Animal (int age){
		this.kind = "사람";
		this.age = age;
	}
	
	// 종류와 나이를 모두 받는 생성자
	Animal (String kind, int age){
		this.kind = kind;
		this.age = age;
	}
	
	// 출력 메소드
	void info() {
		System.out.println(kind + ": " + age + "살");
	}
}
