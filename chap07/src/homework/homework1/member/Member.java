package homework.homework1.member;

public class Member {
	// 필드
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	// 생성자
	public Member() {
		
	}
	
	public void changeName(String name) {
		this.memberName = name;
	}
	
	public void printName() {
		System.out.println("이름: " + memberName);
	}
}
