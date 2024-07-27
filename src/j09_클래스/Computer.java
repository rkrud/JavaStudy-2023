package j09_클래스;
//복습 필수!
public class Computer {
	int year;
	String company;
	String cpu;
	int ram;
	String graphic;
	
	void showInfo() { //매개변수 없고() 리턴 값 없음 	
	System.out.println("제조년: " + year);
	System.out.println("제조사: " + company);
	System.out.println("cpu: " + cpu);
	System.out.println("RAM: " + ram);
	System.out.println("GraphicCard: " + graphic);
	}
	
	void addRam(int gigaByte) {
		int overRam = ram;
		if(ram < 32) {
			ram += gigaByte;
			if(ram > 32) {
				overRam = ram -32;
				System.out.println("램은 최대 32기가 바이트만 장착할 수 있습니다");
				System.out.println(overRam + "초과");
				ram = 32;
			}
		}else {
			System.out.println("더이상 램을 장착할 수 없습니다");
		}
	}
	
	void removeRam(int gigaByte) {
		if(ram > 1)	{
			ram -= gigaByte;
			if(ram < 1) {
				System.out.println("램은 최소 1기가 바이트 이상은 장착하여야 합니다 ");
				ram = 1;
			}
		}else {
			System.out.println("램을 제거할 수 없습니다 ");
		}
	}

}
