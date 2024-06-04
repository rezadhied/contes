package src.main.java;

public class Shape {

	private double square, rectangle, circle;
	
	public Shape() {
		this.reset();
	}
		
	public void reset() {
		square = 0;
		rectangle = 0;
		circle = 0;
	}
	
	public double squareArea(double side) {
		square = side*side;
		return square;
	}
	
	public double rectangleArea(double length, double width) {
		rectangle = length*width;
		return rectangle;
	}
	
	public double circleArea(double radius) {
		circle = Math.PI*radius*radius;
		return circle;
	}
	
}
