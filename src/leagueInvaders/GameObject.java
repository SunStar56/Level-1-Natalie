package leagueInvaders;
import java.awt.Graphics;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	public GameObject(){
		
		
	}
	
	void update() {
		y = y+1;
		
	}
	
	void draw(Graphics g) {
		g.fillRect(x, y, 100, 100);
		
	}
}
