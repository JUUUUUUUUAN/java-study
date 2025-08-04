package sec01.homework.homework1;

import java.util.Arrays;

public class Run {

	public static void main(String[] args) {
		
		String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		
		String[] studentArr = str.split("\n");
		
		for (String s : studentArr) {
			String[] str1 = s.split(",");
			Person person1 = new Person(str1[0], Integer.parseInt(str1[1]), str1[2], str1[3].charAt(0));
			System.out.println(person1.toString());
		}
		
		
		
		
		
	}

}
