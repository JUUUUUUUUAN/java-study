package homework.homework3;

public class CharacterController{

	public CharacterController() {}

	public int countAlpha(String s) throws CharCheckException {	
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <='z') {
				count++;
			} else if(s.charAt(i) == ' ') {
				throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");
			}
		}
		return count;
	}
}
