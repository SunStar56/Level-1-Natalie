import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);
		quizWindow.setSize(1000, 1000);
		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image URL”)
		String orangeCircles = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRhrckKt7FDduG-799utKa9XbBbwqQM12vI2nLE6UXr1q4IDgGT";
		// 2. create a variable of type "Component" that will hold your image
		Component image;
		// 3. use the "createImage()" method below to initialize your Component
		image = createImage(orangeCircles);
		image.setSize(500, 250);
		// 4. add the image to the quiz window
		quizWindow.add(image);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();

		// 6. ask a question that relates to the image
		int orangeCircleQA = JOptionPane.showConfirmDialog(null, "Are the orange circles the same size?");
		// 7. print "CORRECT" if the user gave the right answer

		if (orangeCircleQA == 0) {
			JOptionPane.showMessageDialog(null, "Correct!");
		} else {
			JOptionPane.showMessageDialog(null, "Incorrect.  They are actually both the same size.");
		}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line
		// of code)
		quizWindow.setSize(1000, 1000);
		String elephant = "http://vignette2.wikia.nocookie.net/optical-illusions/images/8/87/Game.jpg/revision/latest?cb=20140412004123";
		// 11. add the second image to the quiz window
		Component image2;
		image2 = createImage(elephant);
		quizWindow.add(image2);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		int elephantQA = JOptionPane.showConfirmDialog(null, "Does the elephant have four feet?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (elephantQA == 0) {
			JOptionPane.showMessageDialog(null,
					"Incorrect.  The elephant appears to have feet that disappear as they travel down.");
		} else {
			JOptionPane.showMessageDialog(null, "Correct.  How many feet do you think it has?");
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
