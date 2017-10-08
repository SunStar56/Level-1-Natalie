import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Level1ReviewCoding implements ActionListener{
	JTextField text;
	JLabel label;
	JFrame frame;
	JPanel panel;
	JButton b1;
	JButton b2;
	public static void main(String[] args) {
		new Level1ReviewCoding().createUI();
		
	
	
}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
		b1.setText("A body part");
		frame.pack();
		}
		if (e.getSource() == b2) {
			 if (text.getText().equalsIgnoreCase("Your right hand") || text.getText().equalsIgnoreCase("Right hand")) {
			text.setText("Correct!");
			}
			else {
				text.setText("Incorrect.");
			}
		}
		}
		
		
	public void createUI() {
		frame = new JFrame();
		panel = new JPanel();
		b1 = new JButton("Hint");
		b2 = new JButton("Submit");
		label = new JLabel();
		 text = new JTextField("Type an answer here");
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(label);
		panel.add(b1);
		b1.addActionListener(this);
		panel.add(b2);
		b2.addActionListener(this);
		panel.add(text);
		label.setText("What can you hold in your left hand, but not your right?");
		frame.pack();
	}
}