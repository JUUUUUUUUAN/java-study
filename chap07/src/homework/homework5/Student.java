package homework.homework5;

public class Student {
	private static int studentNumCount;
	private int studentNum;
	private String name;
	private String className;
	
//	public void setStudentNum(int studentNum) {
//		this.studentNum = studentNum;
//	}
	
	public Student () {
		++studentNumCount;
		studentNum = studentNumCount;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setClassNum(String className) {
		this.className = className;
	}
	
	public void getStudentInfo() {
		System.out.println(studentNum + " " + name + " " + className);
	}
	
}
