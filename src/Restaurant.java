
public class Restaurant {
	public static void main(String[] args) {
		Pizza p1 = new Pizza(5, "cheez", "Cheez Pizza", true);
		Pizza p2 = new Pizza(12, "pepparooni", "Pepparooni Pizza", true);
		Pizza p3 = new Pizza(10, "anvils", "Tasty Anvil Pizza", false);
		Pizza p4 = new Pizza(15, "kitchen sinks", "Everything Pizza", false);
		Pizza p5 = new Pizza(13, "pinahpplee", "Hawaii Pizza", true);
		Pizza p6 = new Pizza(8, "lines of code", "Java Pizza", false);
		Pizza p7 = new Pizza(7, "spoops", "Skeleton Pizza", false);
		p1.getSize();
		p1.getTopping();
		p1.getName();
		p1.getEdibility();
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		System.out.println(p5.toString());
		System.out.println(p6.toString());
		System.out.println(p7.toString());
	}
}
