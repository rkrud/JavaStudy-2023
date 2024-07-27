package j10_배열;

import j09_클래스.Car;
import j09_클래스.Computer;
import j09_클래스.생성자.Computer2;

public class Arrays4 {

	public static void main(String[] args) {
		/*
		 * 실습!
		 * Car 배열 5개
		 * 카 객체 3개 만들기
		 * car1 : 현대 그랜져 오렌지
		 * car2 : 르노 sm5 핑크
		 * car3 : 테슬라 model3 레드
		 * 
		 * 0번 방에 car1 대입
		 * 1번 방에 car2 대입
		 * 3번 방에 car3 대입
		 * 
		 * 반복문을 돌려서 
		 * 회사명 : 현대
		 * 모델명 : 그랜저
		 * 색상 : 오렌지
		 * 
		 * ...
		 * 
		 */
		
		//배열 생성
		Car[] cars = new Car[5]; 
		//2.차 3대 생성
		Car car = new Car("현대","그랜져","오렌지");
		Car car2 = new Car("르노", "sm5", "핑크");
		Car car3 = new Car("테슬라", "model3","레드");
		//3.카배열에 카객체 넣기
		cars[0] = car;
		cars[1] = car2;
		//cars[1] = new Car("르노", "sm5", "핑크"); 바로 해도되나...(밥 먹고 정리 더 ㄱ ㄱ)
		cars[3] = car3;
		//4. 반복문을 돌려 원하는 값을 get으로 뽑아내기
		for(int i=0 ; i < cars.length ; i++) {
			if (cars[i] == null ) {
				continue;
				
			}else{
				System.out.println("회사명: " + cars[i].getCompany());
				System.out.println("모델명: " + cars[i].getModel());
				System.out.println("색상: " + cars[i].getColor());
				
			}
			

			
		}
		
		
		
	
		
		

		

	}

}
