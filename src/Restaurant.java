
public class Restaurant {
	public static void main(String[] args) {
		Pizza p1 = new Pizza(5, "cheez", "Cheez Pizza", true);
		Pizza p2 = new Pizza(12, "pepparooni", "Pepparooni Pizza", true);
		Pizza p3 = new Pizza(10, "anvils", "Tasty Anvil Pizza", false);
		Pizza p4 = new Pizza(15, "kitchen sinks", "Everything Pizza", false);
		Pizza p5 = new Pizza(13, "pinahpplee", "Hawaii Pizza", true);
		p1.getSize();
		p1.getTopping();
		p1.getName();
		p1.getEdibility();
		System.out.println("This " + p1.getSize() + " inch long " + p1.getName() + " contains lots of "
				+ p1.getTopping() + ". It is also known to be the cause of many " + p1.getEdibility()
				+ " rumors that this pizza is edible.");
		System.out.println("This " + p2.getSize() + " inch long " + p2.getName() + " contains lots of "
				+ p2.getTopping() + ". It is also known to be the cause of many " + p2.getEdibility()
				+ " rumors that this pizza is edible.");
		System.out.println("This " + p3.getSize() + " inch long " + p3.getName() + " contains lots of "
				+ p3.getTopping() + ". It is also known to be the cause of many " + p3.getEdibility()
				+ " rumors that this pizza is edible.");
		System.out.println("This " + p4.getSize() + " inch long " + p4.getName() + " contains lots of "
				+ p4.getTopping() + ". It is also known to be the cause of many " + p4.getEdibility()
				+ " rumors that this pizza is edible.");
		System.out.println("This " + p5.getSize() + " inch long " + p5.getName() + " contains lots of "
				+ p5.getTopping() + ". It is also known to be the cause of many " + p5.getEdibility()
				+ " rumors that this pizza is edible.");
	}
}
