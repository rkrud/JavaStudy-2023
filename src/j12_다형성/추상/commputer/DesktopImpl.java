package j12_다형성.추상.commputer;

public class DesktopImpl extends Desktop{

	@Override
	public void onMouseClick() {
		System.out.println("컴퓨터에서 마우스 클릭을 받습니다.");
	}

	@Override
	public void onDisplay() {
		System.out.println("컴퓨터에서 화면을 출력합니다.");
		
	}

}
