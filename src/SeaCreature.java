
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class SeaCreature {

	private String name;

	SeaCreature(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
	String creature = "";
		while (!creature.equalsIgnoreCase("STOP")){
			creature = JOptionPane.showInputDialog("What character would you like?");
			if (!creature.equalsIgnoreCase("STOP")) {
				SeaCreature seaCreature = new SeaCreature(creature);
				seaCreature.manageSeaCreature();}	
		}
		
		}

	private void manageSeaCreature() {
		eat();
		System.out.println("My name is " + name + ".");
		laugh();
	}
	public String getName() {
		return "My name is " + name;
	}

	public void eat() {
		System.out.println(name + " is eating krabby patties");
	}

	public void laugh() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(
					"/Users/League/Google Drive/league-sounds/" + this.name + ".wav").toURI().toURL());
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			System.out.println(name + " is a very serious sea creature and will not laugh on command.");
		}
	}

	
}