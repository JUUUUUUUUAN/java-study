package homework4.person;

public class Person {
	private String name;
	private String address;
	public String phoneNum;
	public double height;
	public double weight;
	
	
	public void print() {
		System.out.println("전화번호: " + phoneNum);
		System.out.println("키: " + height);
		System.out.println("몸무게: " + weight);
	}
	
} 
