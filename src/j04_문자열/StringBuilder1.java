package j04_문자열;

public class StringBuilder1 {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("이름: ");
		stringBuilder.append("홍길동");
		
		stringBuilder.delete(4, 7);//456 삭제
		
		System.out.println(stringBuilder);

	}

}
