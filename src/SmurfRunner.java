import javax.swing.JOptionPane;

public class SmurfRunner {
public static void main(String[] args) {
	
	
	String answer = JOptionPane.showInputDialog("Which smurf would you like a description of?");
	
if (answer.equalsIgnoreCase("handy")) {
	Smurf handy = new Smurf("Handy");
	handy.eat();
	System.out.println("His name is " + handy.getName() + " Smurf.");
}
else if (answer.equalsIgnoreCase("papa")) {
	Smurf papa = new Smurf("Papa");
	System.out.println("His name is " + papa.getName() + " Smurf.");
	System.out.println("His hat color is " + papa.getHatColor() + ".");
	System.out.println("He is a " + papa.isGirlOrBoy() + ".");
}
else if (answer.equalsIgnoreCase("smurfette")) {
	Smurf smurfette = new Smurf("Smurfette");
	System.out.println("Her name is " + smurfette.getName() + ".");
	System.out.println("Her hat color is " + smurfette.getHatColor() + ".");
	System.out.println("She is a " + smurfette.isGirlOrBoy() + ".");
}
else {
	System.out.println("~Not a valid name~");
}

}
}
