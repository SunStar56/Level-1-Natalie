import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) {
		Random rand1 = new Random();
		Random rand2 = new Random();
		int r2 = rand2.nextInt(10);
		int x = 0;
		World world = new World();
		Bug b1 = new Bug();
		Bug b2 = new Bug();
		Flower f1 = new Flower(Color.red);
		Flower f2 = new Flower(Color.red);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				world.add(new Location(i, j), new Flower(Color.darkGray));
			}
		}

		b2.setColor(Color.blue);
		b2.setDirection(90);

		Location b1loc = new Location(rand1.nextInt(10), rand1.nextInt(10));
		Location b2loc = new Location(r2, r2);
		Location f1loc = new Location(r2 - 1, r2);
		Location f2loc = new Location(r2 + 1, r2);
		world.show();
		world.add(b1loc, b1);
		world.add(b2loc, b2);
		world.add(f1loc, f1);
		world.add(f2loc, f2);

	}
}
