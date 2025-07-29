package homework.homework8;

public class GreenTeaController {
	private GreenTea gt = new GreenTea();
	
	public String bakeGreenTeaCake(double flour, double cream, double powder, int cheese) {
		gt.setFlour(flour);
		gt.setCream(cream);
		gt.setPowder(powder);
		gt.setCheese(cheese);
		System.out.println(gt.toString());
		return "치즈 케이크가 완성되었습니다.";
	}
	
}
