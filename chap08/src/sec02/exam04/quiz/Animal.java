package sec02.exam04.quiz;

public abstract class Animal {
	private String kind;
	private int leg;
	
	public Animal(String kind, int leg) {
		this.kind = kind;
		this.leg = leg;
	}
	
	public abstract void eat();
	public abstract void sound();
	
	public String getKind() {
		return this.kind;
	}
	public int getLeg() {
		return this.leg;
	}
}
