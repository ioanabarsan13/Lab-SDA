package Tema3;

public class Square extends HexColorValidator implements Shape {

	private String fillColor;
	private double borderWidth;
	private double size;
	private static final String name_const = "Square";

	public Square(String fillColor, double borderWidth, double size) {
		super();
		if (validate(fillColor)) {
			this.fillColor = fillColor;
			
		}else {
			throw new IllegalArgumentException("the square's color is not value");
		}

		if (borderWidth > 0.0) {
			this.borderWidth = borderWidth;
		}else {
			throw new IllegalArgumentException("the square's borderWith is not value");
		}

		if (size > 0.0) {
			this.size = size;
		}else {
			throw new IllegalArgumentException("the square's size is not value");
		}
	}


	public void draw() {
		
		System.out.println("-".repeat((int)this.borderWidth));
		for( int i=1; i<=(int)this.borderWidth-1; i++) {
			System.out.println( "-".repeat((int)this.borderWidth - 1) + "-");
		}
		

	}


	public double getArea() {
		
		return Math.pow(2, borderWidth);
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