package j12_다형성.factory;

import j11_상속.factory.Factory;

public class FactoryService2 {
	private Factory factory;

	public FactoryService2(Factory factory) {
		this.factory = factory;
	}
	
	public void factoryStart() {
		factory.start();
	}
	
	public void factoryStop() {
		factory.stop();
	}
	


}
