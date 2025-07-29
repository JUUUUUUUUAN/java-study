package homework.homework8;

public class Chocolate extends Cake {
	private int cherry;
	private int chip;
	
	public Chocolate() {}

	public Chocolate(double flour, double cream, int cherry, int chip) {
		super(flour, cream);
		this.cherry = cherry;
		this.chip = chip;
	}

	public int getCherry() {
		return cherry;
	}

	public void setCherry(int cherry) {
		this.cherry = cherry;
	}

	public int getChip() {
		return chip;
	}

	public void setChip(int chip) {
		this.chip = chip;
	}
	
	public String toString() {
		return "밀가루(g): " + super.getFlour() + "(g)\n크림(g): " + super.getCream() + "(g)\n체리: " + cherry +"(개)\n초콜릿 칩:" + chip + "개";
	}
	
	
}
