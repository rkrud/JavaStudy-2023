package j11_상속;

public class AnimalMain {

	public static void main(String[] args) {
		Human human = new Human(); //실행 -> 부모 객체 먼저 생성 후 자식 객체 생성
		Tiger tiger = new Tiger();
//		
//		human.move();
//		tiger.move();
		human.readBooks();
		
		human.move();
	}

}
