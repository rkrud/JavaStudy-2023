package 랜덤;

import java.util.Random;

public class Random3 {

	public static void main(String[] args) {
		/*
		 * 랜덤으로 10개의 수를 뽑아서 그 중 제일 큰 수를 출력!
		 * 
		 * 1. 랜덤
		 * 2. while 10회 반복 
		 * 3. 대소 비교
		 * 
		 */
		Random random = new Random();
		int i = 0;
		int MaxNum = 0 ;
		
		while(i < 10) {
			int rNum = random.nextInt(10);
			System.out.println(rNum);
			
			if(i == 0) {
				MaxNum = rNum;
			}else {
				if(MaxNum < rNum) {
					MaxNum = rNum;
				}
			}
			
			i++;
			
		}
		System.out.println("최: " + MaxNum);
			
		
				
	}

}
