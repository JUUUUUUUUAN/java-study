package homework.homework3;

public class Run {

	public static void main(String[] args) {
		Employee em1 = new Employee();
		
		em1.setAge(25);
		em1.setBonus(0.05);
		em1.setDept("영업부");
		em1.setEmpName("홍길동");
		em1.setEmpNo(100);
		em1.setGender('남');
		em1.setJob("과장");
		em1.setPhone("010-123-4567");
		em1.setSalary(3000000);
		em1.setAddress("서울시 강남구");
		
		System.out.println("=== 홍길동의 정보 ===");
		
		em1.getEmpNo();
		em1.getDept();
		em1.getJob();
		em1.getAge();
		em1.getSalary();
		em1.getPhone();
		em1.getAdderss();
	}

}
