package sec03.exam03.Quiz;

public class Computer {
	
	String model;

	Computer() {
		System.out.println("객체생성완료(모델: " + model + ")");
	}
	
	Computer(String model) {
		this.model = model;
		System.out.println("객체생성완료(모델: " + model + ")");
	}
}
