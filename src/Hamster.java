
public class Hamster {
	private int numLegs;
	private int furLength;
	static int instance;

	public Hamster(int numLegs, int furLength) {
		this.numLegs = numLegs;
		this.furLength = furLength;

	}

	public int getNumLegs() {
		System.out.println(numLegs);
		return numLegs;
	}

	public int setNumLegs(int legs) {
		numLegs = legs;
		return numLegs;
	}

	public int getFurLength() {
		System.out.println(furLength);
		return furLength;
	}

	public int setFurLength(int length) {
		furLength = length;
		return furLength;
	}

}
