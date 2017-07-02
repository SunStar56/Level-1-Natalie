
public class Pizza {
	private int size;
	private String topping;
	private String name;
	private boolean isEdible;

	public Pizza(int size, String topping, String name, boolean isEdible) {
		this.size = size;
		this.topping = topping;
		this.name = name;
		this.isEdible = isEdible;
	}

	public int getSize() {
		return this.size;
	}

	public String getTopping() {
		return this.topping;
	}

	public String getName() {
		return this.name;
	}

	public boolean getEdibility() {
		return this.isEdible;
	}
}
