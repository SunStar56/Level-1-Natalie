package leagueInvaders;

import java.awt.Color;
import java.awt.Graphics;

public class Rocketship extends GameObject{
	int speed;
	boolean left;
	boolean right;
	Rocketship(int x,int y,int width,int height){
		super(x, y, width, height);
		speed = 5;
		
		
	}
	
	void update(){
		if (left == true) {
			x-=speed;
		}
		if (right == true) {
			x += speed;
		}
		
	}
	
	void draw(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect(x, y, width, height);
		
	}
}
