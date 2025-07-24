package homework2;

public class Homework1 {

	String stringSum(String fir, String sec) {
		return fir + sec;
	}
	
	int intPer(int fir, int sec) {
		if(fir < sec) {
			System.out.println("계산할 수 없습니다.");
			return 0;
		}
		return fir * sec;
	}
	
	boolean stringCompare(String s1, String s2) {
		if (s1.equalsIgnoreCase(s2)) return true;
		return false;
	}
	
}
