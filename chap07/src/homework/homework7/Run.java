package homework.homework7;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Student[] studentarr = new Student[3];
		
		studentarr[0] = new Student("김철수", 20, 178.2, 70.0, 1, "정보시스템공학과");
		studentarr[1] = new Student("이영희", 23, 167.0, 54.0, 4, "물리학과");
		studentarr[2] = new Student("홍길동", 21, 197.6, 86.0, 2, "경영학과");
		
		for (Student st : studentarr) {
			System.out.println("=== " + st.name + " ===");
			System.out.println("나이: " + st.getAge());
			System.out.println("키: " + st.getHeight());
			System.out.println("몸무게: " + st.getWeight());
			System.out.println("학년: " + st.getGrade());
			System.out.println("전공: " + st.getMajor());
		}
		
		Employee[] employeearr = new Employee[10];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		System.out.println("=== 사원 입력받기 ===");
		while(true) {
			employeearr[count] = new Employee();
			System.out.print("이름: ");
			employeearr[count].name = sc.nextLine();
			System.out.print("나이: ");
			employeearr[count].setAge(sc.nextInt());
			System.out.print("키: ");
			employeearr[count].setHeight(sc.nextDouble());	
			System.out.print("몸무게: ");
			employeearr[count].setWeight(sc.nextDouble());	
			System.out.print("급여: ");
			employeearr[count].setSalary(sc.nextInt());
			sc.nextLine();
			System.out.print("부서: ");
			employeearr[count].setDept(sc.nextLine());
			count++;
			
			System.out.println("계속 추가하시겠습니까?");
			String again = sc.nextLine();
			if("y".equalsIgnoreCase(again)) {
				continue;
			} else if("n".equalsIgnoreCase(again)) {
				for(int i = 0; i <= count - 1; i++) {
					System.out.println("=== " + employeearr[i].name + " ===");
					System.out.println("나이: " + employeearr[i].getAge());
					System.out.println("키: " + employeearr[i].getHeight());
					System.out.println("몸무게: " + employeearr[i].getWeight());
					System.out.println("급여: " + employeearr[i].getSalary());
					System.out.println("부서: " + employeearr[i].getDept());
				}
					
				break;
			} else {
				
			}

		}
	}
}
