package homework.homework4;

public class Run {

	public static void main(String[] args) {
		SmartPhone[] phone = new SmartPhone[2];
		
		phone[0] = new Galaxy24();
		phone[1] = new Iphone15();
		
		for (int i = 0; i < phone.length; i++) {
			if (phone[i] instanceof Galaxy24 galaxy) {
				galaxy.printMaker();
				galaxy.makeCall();
				galaxy.takeCall();
				galaxy.touch();
				galaxy.charge();
				galaxy.picture();
			} else {
				Iphone15 iphone = (Iphone15) phone[i];
				iphone.printMaker();
				iphone.makeCall();
				iphone.takeCall();
				iphone.touch();
				iphone.charge();
				iphone.picture();
			}
			System.out.println();
		}
	}

}
