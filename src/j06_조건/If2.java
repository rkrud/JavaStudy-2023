package j06_조건;

public class If2 {

	public static void main(String[] args) {
		int score = 80;
		String result = null;
		
		if(score < 0 || score > 100) {
			System.out.println("점수는 0~100점 사이어야 합니다.");
			result = "계산불가";
		}else {
			if(score > 89) {
				System.out.println("90점대 입니다.");
				result = "A";
			}
		}
	}

}
