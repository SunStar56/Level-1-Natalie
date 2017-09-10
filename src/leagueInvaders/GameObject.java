package leagueInvaders;
import java.awt.Graphics;
import java.awt.Rectangle;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	boolean isAlive = true;
	Rectangle collisionBox = new Rectangle();
	public GameObject(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this. height = height;
		
	}
	
	void update() {
		//y = y+1;
		collisionBox.setBounds(x, y, width, height);
	}
	
	void draw(Graphics g) {
	
		
	}
}
