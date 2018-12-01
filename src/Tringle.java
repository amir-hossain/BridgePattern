
public class Tringle extends Shape{

	public Tringle(Color color) {
		super(color);
		
	}

	@Override
	void applyColor() {
		System.out.println("Drawing Triangle with color");
		
		color.applyColor();
		
	}

}
