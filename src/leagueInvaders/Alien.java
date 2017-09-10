package leagueInvaders;

import java.awt.Color;
import java.awt.Graphics;

public class Alien extends GameObject {
int updateNum = 0;
	public Alien(int x, int y, int width, int height) {
		super(x, y, width, height);
	
	}
	
	void update() {
		super.update();
		y+=10;
		if (updateNum >= 0 && updateNum < 25) {
			x+=10;
			updateNum++;
		}
		if (updateNum <= 25) {
			x -= 10;
			updateNum++;
		}
		updateNum++;
		if (updateNum == 50) {
			updateNum = 0;
		}
		
	}
	
	void draw(Graphics g) {
		g.drawImage(GamePanel.alienImg, x, y, width, height, null);
		
	}
	
	
}
