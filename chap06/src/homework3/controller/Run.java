package homework3.controller;

import homework3.employee.Employee;

public class Run {

	public static void main(String[] args) {
		Employee em1 = new Employee();
		Employee em2 = new Employee();
		
		em1.name = "김철수";
		em1.team = "교육운영팀";
		
		em2.name = "이영희";
		em2.team = "경영지원팀";
		
		System.out.println(em1.name + ", " + em1.team);
		System.out.println(em2.name + ", " + em2.team);
	}

}
