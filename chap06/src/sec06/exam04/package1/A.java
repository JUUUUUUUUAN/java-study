package sec06.exam04.package1;


public class A {
	// 필드
	// 클래스 내부에서는 public, default, private 3개의 생성자를 전부 사용 가능
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	// 생성자
	public A(boolean b) {}
	A(int b) {}
	private A(String s) {} // 주로 싱글톤 패턴 사용 시 
	
}
