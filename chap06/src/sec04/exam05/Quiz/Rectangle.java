package sec04.exam05.Quiz;

public class Rectangle {
	int width;
	int height;
	
	
	void area() {
		System.out.println("면적: " + width * height); 
	}
	
	void length() {
		System.out.println("둘레: " +  (width + height) * 2 );
	}
	
}
