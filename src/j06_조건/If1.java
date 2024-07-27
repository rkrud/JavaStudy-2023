package j06_조건;

public class If1 {

	public static void main(String[] args) {
		//ctrl+shift+F -> 자동정렬
		// 돈이 있으면 택시를 타고 돈이 없으면 걸어가라.
		boolean money = true;
		if(money) {
			System.out.println("택시를 타고가라");			
		}
		if(!money) {
			System.out.println("걸어가라");
		}
		System.out.println();
		
		boolean card = false;
		if(card) System.out.println("버스를 타라");
		System.out.println("이용요금을 봐라");
		if(!card) {
			System.out.println("현금이 있는지 확인해라");
		}
		System.out.println();
		
		//동전이 있으면 버스를 타고 그렇지 않으면 걸어가라	
		boolean coin = true;
		if(coin) {
			System.out.println("버스를 타라");
		}else {
			System.out.println("걸어가라");
		}
		/*
		 * if문의 기본구조
		 * if(조건문) {
		 * 		<수행할 문장1>
		 * 		<수행할 문장2>
		 * }else {
		 * 		<수행할 문장a>
		 * 		<수행할 문장b>
		 * }
		 */

	}

}
