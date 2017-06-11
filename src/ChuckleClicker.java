import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton button1 = new JButton("Hear a joke");
	JButton button2 = new JButton("Hear the punchline");
	int count = 0;
	public static void main(String[] args) {
	ChuckleClicker chuckle = new ChuckleClicker();
	chuckle.makeButton();
	
	
}
 void makeButton(){
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(100, 100);
	JPanel panel = new JPanel();
	frame.add(panel);
	panel.add(button1);
	button1.addActionListener(this);
	panel.add(button2);
	button2.addActionListener(this);
	frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	
	
	if(e.getSource() == button1){
		if (count == 0) {
		JOptionPane.showMessageDialog(null, "Why did the chicken cross the road?");	
		}
		else if (count == 1) {
			JOptionPane.showMessageDialog(null, "Why did the farmer cross the road?");
		}
	}else if (e.getSource() == button2) {
		if (count == 0) {
			JOptionPane.showMessageDialog(null, "To get to the other side...");
			count++;
		}else if (count==1) {
			JOptionPane.showMessageDialog(null, "To get his chicken back!");
			count = 0;
		}
	}
	
}
}
