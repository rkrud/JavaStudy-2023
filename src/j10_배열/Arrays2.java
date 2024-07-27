package j10_배열;

public class Arrays2 {

	public static void main(String[] args) {
		//배열에 수를 넣는 세가지 방법
		//1번
		int[] numbers = new int[10];
		numbers[0] = 1; //방은 0번 방 부터 있음
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		numbers[5] = 6;
		numbers[6] = 7;
		numbers[7] = 8;
		numbers[8] = 9;
		numbers[9] = 10;
		//2번
		int[] numbers2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		//3번
		int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println(numbers[2]);
		/*
		 * 실습 
		 * 1000개의 방이 있는 정수배열 numbers4 만들고
		 * 반복문을 통해 1 ~ 1000 까지 값을 넣기
		 * 반복문을 통해 0번 인덱스방부터 999번 인덱스방까지 출력
		 */
		int[] numbers4 = new int[1000];
		for (int i = 0; i < 1000; i++) {
			numbers4[i] = i+1;
			
		}
		for (int j = 0; j < 1000; j++) {
			System.out.println(numbers4[j]);
		}
		
		
		}

}
