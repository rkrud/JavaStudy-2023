package j03_연산자;

public class Operation3 {

	public static void main(String[] args) {
		// 복합대입연산자
		 int result = 10;
		 System.out.println(result);
		 result = 20;
		 System.out.println(result);
		 
		 result = result + 10;
		 System.out.println(result);
		 result += 20;
		 System.out.println(result);
		 
		 result -= 10;
		 System.out.println(result);
		 
		 result /= 10; //몫
		 System.out.println(result);
		 
		 result %= 3; //나머지
		 System.out.println(result);
	}

}
