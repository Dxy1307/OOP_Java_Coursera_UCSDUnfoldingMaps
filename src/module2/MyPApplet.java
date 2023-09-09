package module2;
import processing.core.*;

public class MyPApplet extends PApplet {
	private PImage backgroundImg;
	
	public void setup() {
		size(400, 400);
		background(255);
		stroke(0);
		backgroundImg = loadImage("palmTrees.jpg", "jpg");
	}
	
	public void draw() {
		backgroundImg.resize(0, height);
		image(backgroundImg, 0, 0);
		
		int color[] = sunColorSec(second());
		fill(color[0], color[1], color[2]);
		ellipse(width/4, height/5, width/5, height/5);
	}
	
	public int[] sunColorSec(float second) {
		int[] rgb = new int[3];
		float distance = Math.abs(30 - second);
		float ratio = distance/30;
		
		rgb[0] = (int)(255 * ratio);
		rgb[1] = (int)(255 * ratio);
		rgb[2] = 0;
		return rgb;
	}
}
