package j11_상속.factory;

public class LgFactory extends Factory {

	public LgFactory(int factoryNumber) {
		super(factoryNumber);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void start() {
		System.out.print("엘지 ");
		super.start();
	}
	
	@Override
	public void stop() {
		System.out.print("엘지 ");
		super.stop();
	}
	
	public void produceSmartTV() {
		System.out.println("엘지 스마트tv를 제작합니다.");
	}
	

}
