package 랜덤;

import java.util.Random;

public class Random4 {

	public static void main(String[] args) {
		/*
		 * 세 수 비교!
		 * a, b, c 값 비교
		 * a, b, c 값이 0~49 까지 랜덤하게 나오는 반복 20회를 돌려
		 * 그 중 가장 큰 값 출력
		 */
		
		Random random = new Random();
		int i = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int max = 0;
		
		while(i < 20) {
			a = random.nextInt(49);
			b = random.nextInt(49);
			c = random.nextInt(49);
			if(a > b) {
				if(max < a) {
					max = a;
				}
				else{
					if(max < b) {
						max = b;
					}
				}
				if(max < c) {
					max = c;
				}
				//풀이2
				if(a > b && a > c) {
					if(max < a) {
						max = a;
					}
				}else if(b >a && b>c) {
					if(max < b) {
						max = b;
					}
					
				}else if(c > a && c > b) {
					if(max < c) {
						max = c;
					}
				}
				
				
				
				i++;
			}
		
		System.out.println("최댓값: " + max);
		}
		}
	}
		
	


