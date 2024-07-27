package j04_문자열;

public class String4 {

	public static void main(String[] args) {
		String phoneNumbers = "010/3300/4698, 010/1234/5678";

//  010-3300-4698/010-1234-5678
		String rephone = phoneNumbers.replace("/", "-")
				.replaceAll(", ", "/")
				.replaceAll("010", "011"); 
		System.out.println(rephone);

	}

}
