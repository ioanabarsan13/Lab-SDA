package Tema3;

public class Rectangle extends HexColorValidator implements Shape {

	private String fillColor;
	private double borderWidth;
	private double length;
	private double width;
	private static final String name_const = "Rectangle";

	public Rectangle(String fillColor, double borderWidth, double length, double width) {
		super();
		if (validate(fillColor)) {
			this.fillColor = fillColor;

		} else {
			throw new IllegalArgumentException("the rectangle's color is not value");
		}

		if (borderWidth > 0.0) {
			this.borderWidth = borderWidth;
		} else {
			throw new IllegalArgumentException("the rectangle's borderWith is not value");
		}

		if (length > 0.0) {
			this.length = length;
		} else {
			throw new IllegalArgumentException("the rectangle's length is not value");
		}
		if (width > 0.0) {
			this.width = width;
		} else {
			throw new IllegalArgumentException("the rectangle's width is not value");
		}
	}

	public void draw() {

		System.out.println("*".repeat((int) this.length));
		for (int i = 1; i <= (int) this.width - 2; ++i) {
			System.out.println("*".repeat((int) this.length - 1) + "*");
		}

		System.out.println("*".repeat((int) this.length));
	}

	public double getArea() {

		return this.length * this.width;
	}

	public String getName() {

		return name_const;
	}

	public String getHexFillColor() {

		return this.fillColor;
	}

	public double getBorderWidth() {

		return this.borderWidth;
	}
}