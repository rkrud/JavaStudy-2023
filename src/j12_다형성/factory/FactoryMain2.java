package j12_다형성.factory;

import j11_상속.factory.LgFactory;
import j11_상속.factory.SamsungFactory;

public class FactoryMain2 {

	public static void main(String[] args) {
		SamsungFactory samsungFactory = new SamsungFactory(1);
		LgFactory lgFactory = new LgFactory(1);
		
		FactoryService2 factoryService2 = new FactoryService2(lgFactory);
		
		factoryService2.factoryStart();
		factoryService2.factoryStop();
	}

}
