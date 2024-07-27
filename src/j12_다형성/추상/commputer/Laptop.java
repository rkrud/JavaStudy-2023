package j12_다형성.추상.commputer;

public class Laptop extends Computer{

	@Override
	public void onKeyPress() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDisplay() {
		// TODO Auto-generated method stub
		
	}
	@Override 
	//LaptopImpl에서 "노트북에서" 적어도 되지만 DesktopImpl1,2,3 나오게 되면 또 적어야하니까 Desktop에서 적은 것임 
	public void onSound() {
		System.out.print("노트북에서 "); 
		super.onSound();
	}

}
