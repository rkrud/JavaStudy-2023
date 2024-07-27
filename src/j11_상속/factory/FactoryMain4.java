package j11_상속.factory;

public class FactoryMain4 {

	public static void main(String[] args) {
		Factory[] factories = new Factory[4];
		factories[0] = new SamsungFactory(1);
		factories[1] = new LgFactory(1);
		factories[2] = new SamsungFactory(2);
		factories[3] = new LgFactory(2);
		
		System.out.println(factories[0] instanceof SamsungFactory);
		System.out.println(factories[0] instanceof LgFactory);
		
		/*
		 * 팩토리 배열 반복 1번 돌리기
		 * 삼성 1공장을 가동합니다.
		 * 삼성 스마트폰을 제작합니다.
		 * 삼성 1공장을 멈춥니다.
		 * 
		 * 엘지 1공장을 가동합니다.
		 * 엘지 스마트티비를 제작합니다.
		 * 엘지 1공장을 멈춥니다.
		 * 
		 * 삼성 2공장을 가동합니다.
		 * 삼성 스마트폰을 제작합니다.
		 * 삼성 2공장을 멈춥니다.
		 * 
		 * 엘지 2공장을 가동합니다.
		 * 엘지 스마트티비를 제작합니다.
		 * 엘지 2공장을 멈춥니다.
	
		 */
		
		
		for (int i  = 0 ; i < factories.length ; i++ ) {
			factories[i].start();
			Factory factory = factories[i];
			if(factories[i] instanceof SamsungFactory) {
				SamsungFactory samsungFactory = (SamsungFactory)factories[i]; //다운캐스팅
				samsungFactory.produceSmartphone();
			}else if(factories[i] instanceof LgFactory) {
				LgFactory lgFactory = (LgFactory)factories[i];
				lgFactory.produceSmartTV();
				
			}
			factories[i].stop();
		}
		
		
	}

}
