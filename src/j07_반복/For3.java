package j07_반복;

public class For3 {

	public static void main(String[] args) {
		/*
		 * str = abcdefghijk
		 * 
		 * a
		 * b
		 * c
		 * d
		 * e
		 * f
		 * g
		 * h
		 * i
		 * j
		 * k
		 */
		String str2 = "홍길동";
		System.out.println(str2.length());
		//.length() -> 문자열의 길이 변환
		
		System.out.println();
		
		
		String str = "abcdefghijkadjkjfh";
		for(int i = 0; i < str.length() ; i++) {
			System.out.println(str.substring(i, i + 1));
			
			
		}
		
				
	}

}
