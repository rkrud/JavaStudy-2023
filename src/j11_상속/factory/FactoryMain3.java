package j11_상속.factory;

public class FactoryMain3 {

	public static void main(String[] args) {
		//삼성으로 만들고
		SamsungFactory samsungFactory = new SamsungFactory(1);
		//업캐스팅 하고
		Factory sf = samsungFactory;
		sf.start();
		//다시 삼성으로 내리는 건 가능
		SamsungFactory ssf = (SamsungFactory)sf;
		ssf.start();
		
		//팩토리 만들고 바로 내리는 건 불가능
		Factory factory = new Factory(1);
//		LgFactory lgFactory = (LgFactory)factory;
//		lgFactory.start();
		
		System.out.println(samsungFactory);
		System.out.println(sf); 
		System.out.println(factory);
		
		System.out.println(sf instanceof SamsungFactory);
	}

}
