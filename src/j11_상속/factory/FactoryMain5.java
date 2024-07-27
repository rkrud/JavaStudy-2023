package j11_상속.factory;

public class FactoryMain5 {

	public static void main(String[] args) {
			/*
			 * 실습!
			 * 팩토리 배열 만들기(방은 20개)
			 * 
			 * 반복문을 통해 
			 * 팩토리 배열의 인덱스 번호가 짝수이면 삼성팩토리를 생성해서 대입
			 * 팩토리 배열의 인덱스 번호가 홀수이면 엘지팩토리를 생성해서 대입
			 * 
			 * 삼성공장 1~10
			 * 엘지공장 1~10
			 * 
			 * 배열을 반복돌려
			 * 가동 
			 * 제작 
			 * 중지
			 */
		Factory[] factories = new Factory[20];
		for(int i = 0 ; i < factories.length ; i++) {
			if(i % 2 == 0) {
				factories[i] = new SamsungFactory(i / 2 + 1);		
			}else{
				factories[i] = new LgFactory(i / 2 + 1);
			}
			
		}
		
		for(int i = 0 ; i < factories.length ; i ++) {
			factories[i].start();
			if(factories[i] instanceof SamsungFactory) {
				SamsungFactory samsungFactory = (SamsungFactory)factories[i];  //다운캐스팅 후 produce 사용, 다운캐스팅은 명시적 형변환
				samsungFactory.produceSmartphone();  
				
			}else if (factories[i] instanceof LgFactory) {
				LgFactory lgFactory = (LgFactory)factories[i];
				lgFactory.produceSmartTV();
			}
			factories[i].stop();
			System.out.println();
			
			
			
		}
		
	}

}
