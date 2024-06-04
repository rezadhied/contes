import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Shape shape = new Shape();
		
		System.out.println("10x10 Square Area:" + shape.squareArea(10));
		
		System.out.println("12x15 Rectangle Area:" + shape.rectangleArea(12,15));
		
		System.out.println("7 Radius Cirlce Area:" + shape.circleArea(7));
		
	}

}
