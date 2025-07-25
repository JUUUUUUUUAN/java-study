package homework.homework1.controller;

import homework.homework1.member.Member;

public class Run {
	public static void main(String[] args) {
		Member m1 = new Member();
		
		m1.changeName("홍길동");
		m1.printName();

	}
}
