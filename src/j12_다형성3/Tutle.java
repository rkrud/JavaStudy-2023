package j12_다형성3;

public class Tutle extends Animal implements Swimable {

	public Tutle(int x, int y, int age) {
		super(x, y, age);
		// TODO Auto-generated constructor stub
	}
	
	public void printInfo() {
		System.out.println("Turtle -> " + toString());
	}

	@Override
	public void swimDown(int yDistance) {
//		setY(getY() + yDistance);
 		
	}
}	


		
		
		
		