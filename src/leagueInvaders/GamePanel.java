package leagueInvaders;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener,KeyListener{
	Timer timer;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Font titleFont;
	Font titleFontStart;
	Font titleFontInstructions;
	Rocketship r = new Rocketship(250,700,50,50);
	ObjectManager manager = new ObjectManager();
	//GameObject object;
	public void paintComponent(Graphics g) {
	//object.draw(g);
		if(currentState == MENU_STATE){
			drawMenuState(g);
		}else if(currentState == GAME_STATE){
			drawGameState(g);
		}else if(currentState == END_STATE){
			drawEndState(g);
		}

	}
	
	public GamePanel(){
		timer =  new Timer(1000/60, this);
		//object  = new GameObject();
		titleFont = new Font("Arial",Font.PLAIN,48);
		titleFontStart = new Font("Arial", Font.PLAIN,24);
		titleFontInstructions = new Font("Arial", Font.PLAIN,24);
		manager.addObject(r);
	}
	void startGame() {
		timer.start();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		if(currentState == MENU_STATE){
			updateMenuState();
		}else if(currentState == GAME_STATE){
			updateGameState();
		}else if(currentState == END_STATE){
			updateEndState();
		}

		//object.update();
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyTyped");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyPressed");
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			currentState = currentState+1;
			if(currentState > END_STATE){
				currentState = MENU_STATE;
		}
		
		}
		if (e.getKeyCode() == KeyEvent.VK_A) {
			r.left = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			r.right = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			manager.addObject(new Projectile(r.x+20, r.y, 10, 10));

		}
			
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyReleased");
		if (e.getKeyCode() == KeyEvent.VK_A) {
			r.left = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_D) {
			r.right = false;
		}
	}
	
	void updateMenuState() {
		
		
	}
	
	void updateGameState() {
		manager.update();
		manager.manageEnemies();
		
	}
	
	void updateEndState() {
		
		
	}
	
	void drawMenuState(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, LeagueInvaders.FRAMEWIDTH, LeagueInvaders.FRAMEHEIGHT);
		g.setFont(titleFont);
		g.setColor(Color.YELLOW);
		g.drawString("LEAGUE INVADERS",25, 200);
		g.setFont(titleFontStart);
		g.setColor(Color.GREEN);
		g.drawString("Press ENTER to start", 125, 300);
		g.drawString("Press SPACE for instructions", 90, 400);
		
		
	}
	
	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders.FRAMEWIDTH, LeagueInvaders.FRAMEHEIGHT);
		manager.draw(g);
		
	}
	
	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.FRAMEWIDTH, LeagueInvaders.FRAMEHEIGHT);
		
	}
}
