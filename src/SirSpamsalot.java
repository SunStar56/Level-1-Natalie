import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SirSpamsalot {
SirSpamsalot email = new SirSpamsalot();
static JFrame frame = new JFrame();
static JPanel panel = new JPanel();
static JButton button = new JButton("BAD");
static JButton button2 = new JButton("GOOD");
static JTextField txtfld = new JTextField("Enter Phone Numbers");
public static void main(String[] args) {
	SirSpamsalot();
	frame.add(panel);
	frame.setVisible(true);
	panel.add(button);
	panel.add(txtfld);
	panel.add(button2);
	frame.pack();
}
private static void SirSpamsalot() {
	// TODO Auto-generated method stub
	
}public SirSpamsalot() {
	
}

}
