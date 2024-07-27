package j08_메소드;



public class Method2 {
	

	//메소드 종류
	//반환도 없고 매개변수도 없는 메소드
	public static void test1() {                        //void - return값이 없을 때 씀
		System.out.println("test1 메소드 호출");
	}
	
	
	//반환도 없고 매개변수가 하나인 메소드
	public static void test2(int num) {
		System.out.println("num: " + num);
		System.out.println("test2 메소드 호출");
	}
	
	//반환이 없고 매개변수가 두개인 메소드
	public static void test3(int num2, int num3) {
		System.out.println("num2: " + num2);
		System.out.println("num3: " + num3);
		System.out.println("test2 메소드 호출");
	}
	
	//반환은 있고 매개변수가 없는 메소드
	public static int test4() {
		System.out.println("test4 메소드 호출");
		return 100;
	}
	//반환도 있고 매개변수도 있는 메소드
	public static String test5(String name, int index) {
		System.out.println("name: " + name);
		System.out.println("index: " + index);
		return name + index;
	}
	
	
	
	public static void main(String[] args) {
		test1();
		test2(10);
		test3(200,100);
		System.out.println();
		System.out.println(test4());
		System.out.println();
		int a = test4();
		System.out.println();
		System.out.println(a);
		System.out.println();
		System.out.println(test4());
		System.out.println();
		
		test5("홍길동", 17);
		System.out.println();
		
		String kk = test5("홍길동", 17);
		System.out.println();
		
		System.out.println(kk);
		System.out.println();
		
		System.out.println(test5("홍길동", 17));
	}

}
