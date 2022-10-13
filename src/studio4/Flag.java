package studio4; 

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(245,128,37);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.3);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.5, 0.32, 0.5, 0.127);
		StdDraw.setPenColor(Color.MAGENTA);
		StdDraw.filledCircle(0.15, 0.65, 0.1);
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(0.75, 0.7, 0.15, 0.05);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.01);
		StdDraw.text(0.75, 0.7, "$$$");
		StdDraw.rectangle(0.5, 0.5, 0.495, 0.3);
	}
}
