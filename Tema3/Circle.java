package Tema3;

public class Circle extends HexColorValidator implements Shape {

	private String fillColor;
	private double borderWidth;
	private double radius;
	private static final String name_const = "Circle";
	
	

	public Circle(String fillColor, double borderWidth, double radius) {
		super();
		if (validate(fillColor)) {
			this.fillColor = fillColor;
		}else {
			throw new IllegalArgumentException("the circle's color is not value");
		}
		if ( borderWidth > 0.0 ) {
			this.borderWidth = borderWidth;
		}else {
			throw new IllegalArgumentException("the circle's borderWith is not value");
		}
		if(radius > 0.0) {
			this.radius = radius;
		}else {
			throw new IllegalArgumentException("the circle's borderWith is not value");
		}
		
	}

	
	public void draw() {
		
		for ( int i =0; i<= (int)this.radius-1; i++) {
			System.out.println(" ".repeat((int)this.radius-i) + "#" + " ".repeat(i) + " ".repeat(i) + "#" + " ".repeat((int)this.radius - i));;
		}
			
		 for(int i = (int)this.radius - 1; i >= 0; --i) {
	            System.out.println(" ".repeat((int)this.radius - i) + "#" + " ".repeat(i) + " ".repeat(i) + "#" + " ".repeat((int)this.radius - i));
	        }
		
	}

	
	public double getArea() {
		
		return Math.PI * Math.pow(2, radius);
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