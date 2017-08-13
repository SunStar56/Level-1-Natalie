import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PigLatinConverter implements  ActionListener {
	static JFrame frame;
	static JPanel panel;
	static JTextField input;
	static JTextField esultray;
	static JButton button;
	
public static void main(String[] args) {
	
	frame = new JFrame();
	frame.setVisible(true);
	panel = new JPanel();
	input = new JTextField(20);
	esultray = new JTextField(20);
	button = new JButton("{} CONVERT {}");
	frame.add(panel);
	panel.add(input);
	panel.add(button);
	panel.add(esultray);
	frame.pack();
	translate(input.getText());
}
 PigLatinConverter() {
	 button.addActionListener(this);	
}
 private static boolean isLetter(char c) {
	    return ( (c >='A' && c <='Z') || (c >='a' && c <='z') );
	  }

private static String pigWord(String word) {
    int split = firstVowel(word);
    return word.substring(split)+"-"+word.substring(0, split)+"ay";
  }

private static int firstVowel(String word) {
    word = word.toLowerCase();
    for (int i=0; i<word.length(); i++)
      if (word.charAt(i)=='a' || word.charAt(i)=='e' ||
          word.charAt(i)=='i' || word.charAt(i)=='o' ||
          word.charAt(i)=='u')
        return i;
    return 0;
    }
public String translate(String s) {
    String latin = "";
    int i = 0;
    while (i<s.length()) {

      // Take care of punctuation and spaces
      while (i<s.length() && !isLetter(s.charAt(i))) {
        latin = latin + s.charAt(i);
        i++;
      }

      // If there aren't any words left, stop.
      if (i>=s.length()) break;

      // Otherwise we're at the beginning of a word.
      int begin = i;
      while (i<s.length() && isLetter(s.charAt(i))) {
        i++;
      }

      // Now we're at the end of a word, so translate it.
      int end = i;
      latin = latin + pigWord(s.substring(begin, end));
    }
    return latin;
  }

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==button) {
	System.out.println("got here");	
	System.out.println("esultray.setText(pigWord(input.getText()));");
	}
	
}
}
