package homework.homework8;

public class GreenTea extends Cake {
	private double powder;
	private int cheese;
	
	public GreenTea() {}

	public GreenTea(double flour, double cream, double powder, int cheese) {
		super(flour, cream);
		this.powder = powder;
		this.cheese = cheese;
	}

	public double getPowder() {
		return powder;
	}

	public void setPowder(double powder) {
		this.powder = powder;
	}

	public int getCheese() {
		return cheese;
	}

	public void setCheese(int cheese) {
		this.cheese = cheese;
	}
	
	public String toString() {
		return "밀가루(g): " + super.getFlour() + "(g)\n크림(g): " + super.getCream() + "(g)\n녹차파우더(g): " + powder + "(g)\n치즈큐브: " + cheese + "(개)";
	}
}
