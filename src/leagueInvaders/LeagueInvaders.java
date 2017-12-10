package leagueInvaders;

import javax.swing.JFrame;

public class LeagueInvaders {
	JFrame frame;
	static final int FRAMEWIDTH = 500;
	static final int FRAMEHEIGHT = 800;
	GamePanel panel;

	public LeagueInvaders() {
		frame = new JFrame();
		panel = new GamePanel();
		setup();
	}

	public static void main(String[] args) {
		// LeagueInvaders li = new LeagueInvaders();

	}

	void setup() {
		frame.add(panel);
		frame.setSize(FRAMEWIDTH, FRAMEHEIGHT);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.startGame();
		frame.addKeyListener(panel);

	}
}
