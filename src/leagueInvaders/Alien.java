package leagueInvaders;

import java.awt.Graphics;

public class Alien extends GameObject {
	int startpos = x;
	int maxXLeft = startpos - 20;
	int maxXRight = startpos + 20;
	boolean moveRight = true;

	public Alien(int x, int y, int width, int height) {
		super(x, y, width, height);

	}

	void update() {
		super.update();
		if (moveRight) {
			x = x + 1;
			y = y + 1;
			if (x == maxXRight) {
				moveRight = false;

			}
			}
		 else{
				x = x - 1;
				y = y + 1;
				if (x == maxXLeft) {
					moveRight = true;
				}
		}
System.out.println(maxXLeft + " " + maxXRight + " " + x);
	}

	void draw(Graphics g) {
		g.drawImage(GamePanel.alienImg, x, y, width, height, null);

	}

}
