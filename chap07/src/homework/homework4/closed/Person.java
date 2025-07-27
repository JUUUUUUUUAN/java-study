package homework.homework4.closed;

public class Person {
	private String name;
	private int age;
	
	Person() {}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void getPerson () {
		System.out.println(this.name + "는 " + this.age + "살입니다.");
	}
}
