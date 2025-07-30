package sec02.exam06;

public class UserSurviceExample {
	public static void main(String[] args) {
		UserSurvice service = new UserSurvice();
		
		try {
			service.registerUser(10);
			service.registerUser(-5);	
		} catch (InvalidAgeException  e) {
			System.out.println("예외 발생: " + e.getMessage());
		}
		
	}
}
