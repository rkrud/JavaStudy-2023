package j12_다형성.추상;

public class AnimalMain {

	public static void main(String[] args) {
//		Animal animal = new Animal();
		//추상은 생성이 안됨
		
		Animal animal = new Human();
		animal.move();
		((Human)animal).readBooks(); 
		//animal.readBooks()는 사용할 수 없음-> readBbooks는 Human 에만 있기 때문에 animal을 Human 에서 Animal로 다운캐스팅 해서 써야함
	}

}
