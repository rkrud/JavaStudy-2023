package j12_다형성2;

public class MessengerMain {

	public static void main(String[] args) {
		KakaoTalk kakaoTalk = new KakaoTalk();
		FacebookMessenger facebookMessenger = new FacebookMessenger();
		
		Messenger messenger = facebookMessenger;
		
		MessengerMiddleware messengerMiddleware = new MessengerMiddleware(messenger);
		messengerMiddleware.sendMessege();
		System.out.println("메세지 전송 완료");
		System.out.println();
		
		messengerMiddleware.receiveMessenger();
		System.out.println("새로운 메세지를 받음");
		System.out.println();
		
		messengerMiddleware.runAddOns();
		System.out.println("각각의 플랫폼만의 추가기능");
	}

}
