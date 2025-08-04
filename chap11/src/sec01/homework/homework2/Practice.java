package sec01.homework.homework2;

public class Practice {
	
	public String takeState(String s) {
		String[] a = s.split(" ");
//		for (int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//			
//		}
		for (int i = 0; i < a.length; i++) {
			int lastIndex = a[i].length() - 1;
			if (a[i].charAt(lastIndex) == '구') return a[i];
		}
		return null;
	}
}
