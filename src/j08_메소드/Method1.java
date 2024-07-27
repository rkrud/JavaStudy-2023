package j08_메소드;

public class Method1 {
	//함수: (믹서기 이미지)
	//
//함수가 클래스 안에 존재하면 메소드
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + sum);
	}
     	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
		
	}

}
