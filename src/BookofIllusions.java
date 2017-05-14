import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * We’re going to make a slideshow of cool optical illusions. When the user
 * clicks on an illusion, a new one will be loaded.
 **/

public class BookofIllusions extends MouseAdapter {
	JFrame frame = new JFrame();
	String image = "Seal.jpg";
	JLabel label;
	int slide = 1;

	/*
	 * Here we are instantiating our BookOfIllusions class and calling it’s
	 * createBook() method. This is because we want to get out of the static
	 * main method, so that we can add a click listener to each illusion.
	 */

	public static void main(String[] args) throws Exception {
		BookofIllusions illusions = new BookofIllusions();
		illusions.createBook();

	}

	// 1. Make a JFrame variable and initialize it using "new JFrame()"

	private void createBook() {
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		label = loadImageFromComputer(image);
		frame.add(label);
		frame.pack();
		frame.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {
		slide++;
		System.out.println("-=-~Clicked~-=-");
		frame.remove(label);
		if (slide == 2) {
			image = "Panda.jpg";
			label = loadImageFromComputer(image);
		} else if (slide == 3) {
			image = "Cat.jpeg";
			label = loadImageFromComputer(image);
		} else if (slide == 4) {
			image = "Rabbit.jpeg";
			label = loadImageFromComputer(image);

		}
		frame.add(label);
		frame.pack();

		// 12. remove everything from the frame that was added earlier
		// 13. load a new image like before (this is more than one line of code)
		// 14. pack the frame
	}

	// [OPTIONAL] 15. goad your users with some annoying or witty pop-ups

	/*
	 * To use this method, the image must be placed in your Eclipse project
	 * under "default package".
	 */
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

}
