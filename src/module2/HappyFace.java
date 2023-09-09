package module2;
import processing.core.*;

public class HappyFace extends PApplet {
	public void setup() {
		size(400, 400);
		background(200, 200, 200);
	}
	
	public void draw() {
		// face
		fill(255, 255, 0);
		ellipse(200, 200, 390, 390);
		
		// eyes
		fill(0, 0, 0);
		ellipse(120, 130, 50, 60);
		ellipse(280, 130, 50, 60);
		
//		noFill();
		arc(200, 280, 75, 75, 0, PI);
	}
}
