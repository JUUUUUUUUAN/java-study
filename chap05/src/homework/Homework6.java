package homework;

public class Homework6 {

	public static void main(String[] args) {
		
//		String tree = "";
//		int count = 1;
//		for (int i = 4; i >= 0; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 1; k <= count; k++) {
//					tree += "*";
//			}
//			count += 2;
//			System.out.println(tree);
//			tree = "";
//		}
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
