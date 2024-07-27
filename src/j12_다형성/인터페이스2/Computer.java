package j12_다형성.인터페이스2;

public class Computer {
	private HDMI hdmi;
	
	
	public Computer(HDMI hdmi) {
		this.hdmi = hdmi;
	}
	
	public void powerOn() {
		connectedDisplay();
		System.out.println("컴퓨터 전원을 켭니다");
	}
	
	public void powerOff() {
		System.out.println("컴퓨터 전원을 끕니다.");
		disConnectedDisplay();
	}
	private void connectedDisplay() {
		System.out.println("출력장치를 연결합니다.");
		hdmi.connect();
	}
	private void disConnectedDisplay() {
		System.out.println("출력장치 연결을 해제합니다.");
		hdmi.disConnect();
	}

}
