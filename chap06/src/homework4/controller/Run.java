package homework4.controller;

import homework4.person.Person;

public class Run {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		p1.phoneNum = "01012345678";
		p1.height = 190.5;
		p1.weight = 100.2;
		
		p2.phoneNum = "01056434563";
		p2.height = 175.4;
		p2.weight = 65.6;
		
		p1.print();
		p2.print();
	}

}
