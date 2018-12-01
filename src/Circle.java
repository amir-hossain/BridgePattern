
public class Circle extends Shape{

	public Circle(Color color) {
		super(color);
		
	}

	@Override
	void applyColor() {
		System.out.println("Drawing circle with color");
		
		color.applyColor();
		
	}


}
