package leagueInvaders;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener,KeyListener{
	Timer timer;
	final int MENU_STATE = 0;
	final int GAME_STATE = 2;
	final int END_STATE = 3;
	final int INSTRUCTION_STATE = 1;
	int currentState = MENU_STATE;
	Font titleFont;
	Font titleFontStart;
	Font titleFontInstructions;
	Font instructionsFont;
	Font instructionsEnd;
	Font gameOverLarge;
	Font gameOverSmall;
	public static BufferedImage alienImg;
	public static BufferedImage rocketImg;
	public static BufferedImage bulletImg;
	public static BufferedImage spaceImg;
	Rocketship r = new Rocketship(250,700,50,50);
	ObjectManager manager = new ObjectManager();
	public void paintComponent(Graphics g) {
		if(currentState == MENU_STATE){
			drawMenuState(g);
		}else if(currentState == GAME_STATE){
			drawGameState(g);
		}else if(currentState == END_STATE){
			drawEndState(g);
		}else if (currentState == INSTRUCTION_STATE) {
			drawInstructionState(g);
		}

	}
	
	public GamePanel(){
		timer =  new Timer(1000/60, this);
		titleFont = new Font("Arial",Font.PLAIN,48);
		titleFontStart = new Font("Arial", Font.PLAIN,24);
		titleFontInstructions = new Font("Arial", Font.PLAIN,24);
		instructionsFont = new Font("Arial",Font.PLAIN,24);
		instructionsEnd = new Font("Arial", Font.ITALIC, 48);
		gameOverSmall = new Font("Arial", Font.PLAIN,24);
		gameOverLarge = new Font("Arial", Font.ITALIC, 50);
		manager.addObject(r);
		try {
			alienImg = ImageIO.read(this.getClass().getResourceAsStream("alien.png"));
			rocketImg = ImageIO.read(this.getClass().getResourceAsStream("rocket.png"));
			bulletImg = ImageIO.read(this.getClass().getResourceAsStream("bullet.png"));
			spaceImg = ImageIO.read(this.getClass().getResourceAsStream("space.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

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
		}else if (currentState == INSTRUCTION_STATE) {
			updateInstructionState();
		}

		
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER && currentState != GAME_STATE) {
			if (currentState == MENU_STATE) {
				currentState = GAME_STATE;
			}else {
				currentState = currentState+1;
			}		
		if(currentState > END_STATE){
				currentState = MENU_STATE;
		}
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE && currentState == MENU_STATE) {
			currentState = INSTRUCTION_STATE;
			
		
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
		manager.checkCollision();
		if (r.isAlive == false) {
			currentState = END_STATE;
			manager.reset();
			r=new Rocketship(250, 700, 50, 50);
			manager.addObject(r);
		}
		manager.setScore(manager.getScore());
	}
	
	void updateEndState() {
		
		
	}
	
	void updateInstructionState() {
		
		
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
		g.drawImage(spaceImg, 0, 0, LeagueInvaders.FRAMEWIDTH, LeagueInvaders.FRAMEHEIGHT, null);
		manager.draw(g);
		
		
	}
	
	void drawEndState(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0, 0, LeagueInvaders.FRAMEWIDTH, LeagueInvaders.FRAMEHEIGHT);
		g.setFont(gameOverLarge);
		g.setColor(Color.BLACK);
		g.drawString("GAME OVER", 100, 200);
		g.setFont(gameOverSmall);
		g.drawString("You shot "  + "aliens!  Press ||ENTER|| to restart.", 20, 300);
	}
	
	void drawInstructionState(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, LeagueInvaders.FRAMEHEIGHT, LeagueInvaders.FRAMEWIDTH);
		g.setFont(instructionsFont);
		g.setColor(Color.BLACK);
		g.drawString("This is League Invaders!   Shoot the aliens", 25, 250);
		g.drawString("with your blaster using SPACE, move with", 25, 300);
		g.drawString("A and D, and try to stay alive.", 80, 350);
		g.drawString("Press ENTER to play", 125, 600);
		g.setFont(instructionsEnd);
		g.drawString("GOOD LUCK", 90, 450);
		
	}
}
