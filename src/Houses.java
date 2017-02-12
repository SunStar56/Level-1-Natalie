import java.awt.Color;
import java.lang.reflect.Method;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	static Robot r = new Robot();
	static int SMALL = 1;
	static int MEDIUM = 2;
	static int LARGE = 3;
	static int height = 0;
public static void main(String[] args) {
	r.moveTo(0, 950);
	r.penDown();
	r.setSpeed(10);
	for (int i = 0; i < 10; i++) {
		
	int rand = new Random().nextInt(4); 

	if (rand == SMALL){
		height = 60;	
	}
	if (rand == MEDIUM) {
		height = 120;
	}
	if (rand == LARGE){
		height = 250;
	}
	Houses program = new Houses ();

		program.drawHouse(height,Color.ORANGE);
		
	}
}


void drawHouse(int height, Color color) {
	r.setPenColor(color);
	r.move(height);
	if (height==250) {
		r.turn(90);
		r.move(125);
		r.turn(90);
	}
	else {

		if (height==60) {
			//drawSmallRoof();
		}
		else {
			drawMedRoof();
		}

	r.move(height);

	drawGrass();
}

}


private void drawGrass() {
	r.turn(-90);
	r.setPenColor(Color.GREEN);
	r.move(30);
	r.turn(-90);
}

void drawSmallRoof(){
	r.turn(45);
	r.move(30);
	r.turn(90);
	r.move(30);
	r.turn(45);
	
}


void drawMedRoof() {
	r.turn(45);
	r.move(60);
	r.turn(45);
	r.move(60);
	r.turn(45);
}
}
