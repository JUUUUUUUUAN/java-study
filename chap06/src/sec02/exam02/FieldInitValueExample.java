package sec02.exam02;

public class FieldInitValueExample {

	public static void main(String[] args) {
		// 객체 생성
		FieldInitValue fiv = new FieldInitValue();
				
		System.out.println("byteField: " + fiv.byteField);
		System.out.println("shortField: " + fiv.shortField);
		System.out.println("intField: " + fiv.intField);
		System.out.println("longField: " + fiv.longField);
				
		System.out.println("booleanField: " + fiv.booleanField);
		System.out.println("charField: " + fiv.charField); // 빈 공백(NULL 문자)
				
		System.out.println("floatField: " + fiv.floatField);
		System.out.println("doubleField: " + fiv.doubleField);
				
		System.out.println("arrField: " + fiv.arrField);
		System.out.println("referenceField: " + fiv.referenceField);
	}

}
