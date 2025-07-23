package sec04.exam05.Quiz;

public class Rectangle {
	int width;
	int height;
	
	
	void area() {
		System.out.println("면적: " + width * height); 
	}
	
	void length() {
		System.out.println("둘레: " + ( (width * 2) + (height *2) ));
	}
	
	int getEvenTotal(int begin, int end) {
		int sum = 0;
		for (int i = begin; i <= end; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
}
