package homework.homework5;

public class Run {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();		
		Student s3 = new Student();
		
		s1.setName("김철수");
		s1.setClassNum("A");
		s2.setName("홍길동");
		s2.setClassNum("F");		
		s3.setName("이영희");
		s3.setClassNum("B");
		
		s1.getStudentInfo();
		s2.getStudentInfo();
		s3.getStudentInfo();
		
	}

}
