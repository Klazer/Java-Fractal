import java.awt.*;
import java.awt.geom.Point2D;
import java.util.*;


public class Main {


	public static void main(String[] args) {

		System.out.println("Please enter in a shape you want for your fractal: ");
		Scanner Shape = new Scanner(System.in);
		String inputShape = Shape.nextLine();
		int count = 7;

		if (inputShape.equals("Triangle") || inputShape.equals("triangle")) {
			Canvas drawing = new Canvas(800, 800);
			Triangle myTriangle = new Triangle(400, 400, 100, 200);
			myTriangle.setColor(Color.blue);

			double xA = myTriangle.getXPos();
			double yA = myTriangle.getYPos();

			double xB = myTriangle.getXPos() + myTriangle.getWidth();
			double yB = myTriangle.getYPos();

			drawFractal(count, xA, yA, xB, yB, myTriangle, drawing);
		}
	}

