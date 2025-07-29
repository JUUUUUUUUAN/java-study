package homework.homework8;

public class ChocolateController {
	private Chocolate c = new Chocolate();
	
	public String  bakeChocolateCake(double flour, double cream, int cherry, int chip) {
		c.setFlour(flour);
		c.setCream(cream);
		c.setCherry(cherry);
		c.setChip(chip);
		System.out.println(c.toString());
		return "초콜릿 케이크가 완료되었습니다";
	}
}
