
public class Main {

	public static void main(String[] args) {
		Shape greenCircle=new Circle(new Green());
		Shape redCircle=new Circle(new Red());
		
		Shape greenTriangle=new Tringle(new Green());
		Shape redTriangle=new Tringle(new Red());
		
		greenCircle.applyColor();
		redCircle.applyColor();
		greenTriangle.applyColor();
		redTriangle.applyColor();
		

	}

}
