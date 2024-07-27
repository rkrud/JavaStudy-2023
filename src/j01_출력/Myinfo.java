package j01_출력;

public class Myinfo {

	public static void main(String[] args) {
		/*
		 * ctrl + space -> 자동완성
		 * sysout ctrl + space
		 * syso ctrl + space -> 출력문 자동완성
		 */
		char name1 = '홍'; 
		char name2 = '길';
		char name3 = '동';
		//char : 기본 자료형
		
		String name4 = "홍길동";
		//String: class자료형
		int age = 18;
		String address = "부산 대연동";
		
		System.out.print("성: ");
		System.out.println("홍");
		
		System.out.print("성: ");
		System.out.println(name1);
		
		System.out.println("이름: ");
		System.out.println(name1);
		System.out.println("" +name1 +name2 +name3);
		System.out.println();
		System.out.println(name4);
		
		System.out.println("나이: ");
		System.out.println(age);
		System.out.println("주소: ");
		System.out.println(address);
		
		
	}

}
