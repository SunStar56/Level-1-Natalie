import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuelingButtons implements ActionListener {
	
	public static void main(String[] args) {
		new DuelingButtons().createUI();
	}

	JButton leftButton = new JButton();
	JButton rightButton = new JButton();
	
	Dimension BIG = new Dimension(400,400);
	Dimension SMALL = new Dimension(200,200);
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	private void createUI() {
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.add(panel);
frame.setVisible(true);
leftButton.setText("Click me! :3");
rightButton.setText("Click me! :>");
leftButton.addActionListener(this);
rightButton.addActionListener(this);
panel.add(leftButton);
panel.add(rightButton);
frame.pack();
frame.setTitle("Demanding Buttons");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();

		if (buttonPressed == leftButton) {
			rightButton.setText("No, click ME! :<");
			rightButton.setPreferredSize(BIG);
			leftButton.setText("Click me! :3");
			leftButton.setPreferredSize(SMALL);
		}
		if (buttonPressed == rightButton) {
			leftButton.setText("No, please click me instead! :c");
			leftButton.setPreferredSize(BIG);
			rightButton.setText("Click me! :>");
			rightButton.setPreferredSize(SMALL);
		}
		frame.pack();
	}
}
