import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		FortuneCookie fortune = new FortuneCookie();
		fortune.showButton();

	}

	private void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		button.addActionListener(this);
		System.out.println("...");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int rand = new Random().nextInt(4);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You will eat more Chinese food.");
		} else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "Don't eat the yellow snow.");
		} else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You will realize that these fortunes do not exsist.");
		} else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You will go get more fortune cookies.");
		} else if (rand == 4) {
			JOptionPane.showMessageDialog(null, "Remember to look out for flying sheep.");
		}

	}
}
