package Tema3;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		List<Shape> shapes = new ArrayList<>();

		shapes.add(new Square("#25afc2", 4, 2.0));
		shapes.add(new Rectangle("#2aa121", 2.8, 5.8, 6.2));
		shapes.add(new Circle("#2ab222", 2.8, 2.0));

		for (Shape shape : shapes) {
			System.out.println("The shape name is: " + shape.getName());
			System.out.println("area: " + shape.getArea() + " cm2");
			System.out.println("color cod: " + shape.getHexFillColor());
			System.out.println("borderwidth: " + shape.getBorderWidth());
			System.out.println("shape's drawing: ");
			shape.draw();
			System.out.println();
			System.out.println();
		}

	}
} 