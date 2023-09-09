package module2;

import processing.core.*;
import de.fhpotsdam.unfolding.*;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;

public class Test extends PApplet {
	private UnfoldingMap map;
	
	public void setup() {
		size(800, 600, OPENGL);
		map = new UnfoldingMap(this, 50, 50, 700, 500, new Google.GoogleMapProvider());
		MapUtils.createDefaultEventDispatcher(this, map);
	}
	
	public void draw() {
		map.draw();
		drawButton();
	}
	
	private void drawButton() {
		fill(255);
		rect(100, 100, 25, 25);
		
		fill(100, 100, 100);
		rect(100, 150, 25, 25);
	}
	
	public void mouseReleased() {
		if(mouseX > 100 & mouseX < 125 && mouseY > 100 && mouseY < 125) {
			background(255, 255, 255);
		} else if(mouseX > 100 && mouseX < 125 && mouseY > 150 && mouseY < 175) {
			background(100, 100, 100);
		}
	}
}