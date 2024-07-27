package j07_반복;

public class For2 {

	public static void main(String[] args) {
		/*
		 * 2단
		 * 2 x 1 =2
		 *...
		 *2 x 9 = 18
		 * 3단
		 *...
		 *	
		 *9단 
		 *...	 
		 */
		
		for(int i = 0; i < 8; i++) {
			System.out.println(i + 2 + "단");
			for(int j = 0; j < 9; j++) {
				System.out.println((i + 2) + "x" + (j + 1) + "=" + (i + 2) * (j + 1));
			}
		}
		//i + 2, j + 1 변수에 담아도 됨

	}

}
