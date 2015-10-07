package structure;

import processing.core.PApplet;

public class CoordinateClass extends PApplet{

	// setup is run once, it draws the initial environment.
	public void setup() {
		size(400, 400);
		background(0);
		// noLoop();
	}

	public void draw() {
		// lets draw a point using the coordinate
		stroke(255, 0, 0);
		point(width/2, height/2);

		// lets draw a triangle
		stroke(0, 255, 0);
		triangle(width/2, height/4, width/4, 3 * height/4, 3 *width/4, 3 * height/4);
		// triangle(30, 75, 58, 20, 86, 75);

		// lets draw a line
		stroke(255, 255, 255);
		line(width/4, height/4, width/2, height);


	}
}
