package j12_다형성.factory;

import j11_상속.factory.LgFactory;
import j11_상속.factory.SamsungFactory;

public class FactoryMain {

	public static void main(String[] args) {
		SamsungFactory samsungFactory = new SamsungFactory(1);
		LgFactory lgFactory = new LgFactory(1);
		
		FactoryService factoryService = new FactoryService(samsungFactory); // SamsungFactory가 Factory와 상속 관계이므로 업캐스팅 됨 
		
		factoryService.factoryStart();
		factoryService.factoryStop();
	}

}
