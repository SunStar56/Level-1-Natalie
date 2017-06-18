import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class CutenessTV implements MouseListener {
	private	JFrame frame = new JFrame();
	private	JPanel panel = new JPanel();
	private	JButton duckButton = new JButton("Duck :D");
	private JButton frogButton = new JButton("Frog ^-^");
	private JButton unicornButton = new JButton("Unicorn :3");
	public CutenessTV(){
	duckButton.addMouseListener(this);
	frogButton.addMouseListener(this);
	unicornButton.addMouseListener(this);
	}
	void run(){
		frame.add(panel);
		panel.add(duckButton);
		panel.add(frogButton);
		panel.add(unicornButton);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource()==duckButton) {
			showDucks();
		}
		else if (e.getSource()==frogButton) {
			showFrog();
		}
		else if (e.getSource()==unicornButton) {
			showUnicorns();
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
		//Unused
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		//Unused
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		//Unused
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		//Unused
		
	}
	void showDucks() {
		playVideo("oMQI0bJJOvM");
	}

	void showFrog() {
		playVideo("BaYAR9S3D00");
	}
	
	void showUnicorns() {
		playVideo("17o1OlroNSE");
	}
 
	void playVideo(String videoID) {
		try {
	URI uri = new URI("https://www.youtube.com/watch?v="+videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
