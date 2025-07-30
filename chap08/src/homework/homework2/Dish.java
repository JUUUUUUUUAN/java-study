package homework.homework2;

public class Dish extends Menu{
	private String ingredients;
	
	public Dish() {
	}

	public Dish(String ingredients) {
		this.ingredients = ingredients;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	
	@Override
	public void cook() {
		System.out.println(super.toString() + "\n재료: " + ingredients);
	}
}
