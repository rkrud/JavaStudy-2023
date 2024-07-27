package j12_다형성.추상;
//추상은 abstract 사용
public abstract class Animal2 {
	
	public abstract void run();
	// 추상메소드가 하나라도 있으면 추싱클래스로 정의
	
	public abstract void attack();
	
	public abstract void eat();
	
	public void sleep() {
		System.out.println("동물이 잠을 잡니다.");
	}                                                 // sleep()은 추상 메소드가 아님
	
	

}
