import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LottoNumbers implements ActionListener {
	JFrame frame = new JFrame();
	JLabel numbers = new JLabel();
	Random rand = new Random();
	String nums = "";

	public static void main(String[] args) {
		LottoNumbers l = new LottoNumbers();

	}

	LottoNumbers() {
		frame.setVisible(true);

		frame.setSize(100, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton button = new JButton("Generate");
		panel.add(button);
		button.addActionListener(this);
		panel.add(numbers);

		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		nums = "";
		for (int i = 0; i < 6; i++) {
			nums += " " + rand.nextInt(50);
		}
		numbers.setText(nums);
		frame.pack();

	}
}
