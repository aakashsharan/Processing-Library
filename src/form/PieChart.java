package form;

import java.awt.Color;

import processing.core.PApplet;

public class PieChart extends PApplet {

	// angles array containing the angle we need to use makine pie chart.
	int[] angles = {10, 42, 30, 78, 90, 22, 100 , 52};

	public void setup() {
		size(400, 400);
		noStroke();
		noLoop();
	}

	public void draw() {
		background(133, 179, 66);
		pieChart(200, angles);

	}

	// method to make pie chart.
	public void pieChart(float diameter, int[] dataAngles) {
		float lastAngle = 0;
		int colorGeneratorOne = 70;
		int colorGeneratorTwo = 250;
		for(int i = 0; i < dataAngles.length; i++) {
			float color = map(i, 0, dataAngles.length, (int)(colorGeneratorOne * Math.random()), (float)(colorGeneratorTwo * Math.random()));
			fill(color);
			arc(width/2, height/2, diameter, diameter, lastAngle, lastAngle+radians(angles[i]));

			lastAngle += radians(angles[i]);
		}
	}
}
