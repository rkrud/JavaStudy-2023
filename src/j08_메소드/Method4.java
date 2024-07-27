package j08_메소드;

public class Method4 {
	
	public static String add(int num1, int num2) {
		System.out.println("계산이 완료되었습니다");
		int sum = num1 + num2;
		return "정답은 " + sum + "입니다";
	}
	
	public static String add(int num1, int num2, int num3) {
		System.out.println("계산이 완료되었습니다");
		int sum = num1 + num2 + num3;
		return "정답은 " + sum + "입니다";
		
	}
	

	public static void main(String[] args) {
		/*
		 * add(1, 2);
		 * 계산이 완료되었습니다
		 * 
		 * sysout(add(1,2));
		 * 계산이 완료되었습니다.
		 * 정답은 3입니다. - return 값
		 * 
		 * add(1,2,3);
		 * 계산이 완료되었습니다.
		 * 
		 * sysout(add(1,2,3));
		 * 계산이 완료되었습니다.
		 * 정답은 6입니다
		 */
		add(1, 2);
		System.out.println();
		System.out.println(add(1,2));
		System.out.println();
		add(1,2,3);
		System.out.println();
		System.out.println(add(1,2,3));
	}

}
