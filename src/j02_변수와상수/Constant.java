package j02_변수와상수;

public class Constant {

	public static void main(String[] args) {
		// 세번클릭 하면 한줄 선택
		
		final int Max_Number = 100;
		final int Min_Number = 0;
		// final은 확정 : 상수
		
		int num = 10;
		num = 20;
		
		System.out.println("최댓값: " + Max_Number);
		System.out.println("최솟값: " + Min_Number);
		System.out.println("현재값: " + num);
		
	}

}
