package homework.homework2;

public class Drink extends Menu{
	private String recipe;
	
	public Drink() {
		super();
	}
	
	public Drink(String name, int price,String recipe) {
		super(name, price);
		this.recipe = recipe;
	}

	public String getRecipe() {
		return recipe;
	}

	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}

	@Override
	public void cook() {
		System.out.println(super.toString() + "\n레시피: " + recipe);
	}
	
}
