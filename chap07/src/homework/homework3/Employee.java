package homework.homework3;

public class Employee {
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonus;
	private String phone;
	private String address;
	
	public Employee() {}
	
	public Employee (int empNo, String empNa) {
		this.empNo = empNo;
		this.empName = empName;
	}
	
	public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary, double bonus, String phone, String address) {
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonus = bonus;
		this.phone = phone;
		this.address = address;
	}
	
	// 입력 메소드
	public void setEmpNo (int empNo) {
		this.empNo = empNo;
	}
	public void setEmpName (String empName) {
		this.empName = empName;
	}
	public void setDept (String dept) {
		this.dept = dept;
	}
	public void setJob (String job) {
		this.job = job;
	}
	public void setAge (int age) {
		this.age = age;
	}
	public void setGender (char gender) {
		this.gender = gender;
	}
	public void setSalary (int salary) {
		this.salary = salary;
	}
	public void setBonus (double bonus) {
		this.bonus = bonus;
	}
	public void setPhone (String phone) {
		this.phone = phone;
	}
	public void setAddress (String address) {
		this.address = address;
	}
	
	// 출력 메소드
	public void getEmpNo () {
		System.out.println("사번: " + this.empNo);
	}
	public void getEmpName () {
		System.out.println("이름: " + this.empName);
	}
	public void getDept() {
		System.out.println("부서: " + this.dept);
	}
	public void getJob() {
		System.out.println("직급: " + this.job);
	}
	public void getAge() {
		System.out.println("나이: " + this.age);
	}
	public void getGender() {
		System.out.println("성별: " + this.gender);
	}
	public void getSalary () {
		System.out.println("월급: " + this.salary);
	}
	public void getBonus() {
		System.out.println("상여: " + this.bonus);
	}
	public void getPhone() {
		System.out.println("전화번호: " + this.phone);
	}
	public void getAdderss() {
		System.out.println("주소: " + this.address);
	}
}

