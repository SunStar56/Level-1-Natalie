
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

	public String toString() {
		String message = "This " + this.getSize() + " inch long " + this.getName() + " contains lots of "
				+ this.getTopping() + ". It is also known to be the cause of many " + this.getEdibility()
				+ " rumors that this pizza is edible.";
		return message;

	}
}
