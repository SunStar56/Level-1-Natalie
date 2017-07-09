import java.applet.AudioClip;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class CowTimer {
	private static int minutes;

	public static void main(String[] args) throws InterruptedException {
		/* 1. Make a CowTimer, set the time and start it. */

		String time = JOptionPane.showInputDialog("What amount of time should the timer be set for (in minutes)?");
		int timeInt = Integer.parseInt(time);
		minutes = timeInt;
		CowTimer moo = new CowTimer();
		moo.setTime(minutes);
		moo.start();
	}

	public void setTime(int minutes) {
		this.minutes = minutes;
		System.out.println("Cow set to " + minutes + " minutes.");
	}

	public void start() throws InterruptedException {
		for (int i = minutes; i > 0; i--) {
			System.out.println(minutes);
			Thread.sleep(60000);
			minutes = minutes - 1;
		}
		if (minutes <= 0) {
			for (int i = 0; i < 10; i++) {
				playSound("llama.wav");
				speak("Get-up-and-walk-get-up-and-walk");
			}
		}
		/*
		 * 2. Count down the minutes, print the current minute then sleep for 60
		 * seconds using Thread.sleep(int milliseconds).
		 */

		/*
		 * 3. When the timer is finished, use the playSound method to play a moo
		 * sound. You can download one from freesound.org, then drag it into
		 * your default package. Tell the students (by speaking) it's time to
		 * walk.
		 */

	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	private void speak(String stuffToSay) {
		try {
			Runtime.getRuntime().exec("say " + stuffToSay).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
