package sec01.exam02;

public class ArrayIndexOutOfBoundsExample {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		int result = arr[0] + arr[2];
//		int result = arr[0] + arr[3]; // 예외 발생(중지)
		
		System.out.println(result);
		
		
		String data1 = args[0]; // 예외 발생
		String data2 = args[1];
		
		System.out.println("args[0]: " + data1);
		System.out.println("args[1]: " + data2);
		
	}

}
