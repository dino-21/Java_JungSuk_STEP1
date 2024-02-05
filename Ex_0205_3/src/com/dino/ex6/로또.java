package com.dino.ex6;

public class 로또 {
	public static void main(String[] args) {

		// 1~45 숫자 중에서 랜덤하게 6개 추출........

		int[] lotto = new int[6];  //초기값 [0,0,0,0,0,0]
		boolean flag = false;

		for (int j = 0; j < 5; j++) {
			// i =5
			for (int i = 0; i < lotto.length; i++) {
				flag = false;
				int num = (int) (Math.random() * 45) + 1;   //로또 번호:[ 12, 5, 34, 7, 18, 29]

				for (int k = 0; k < i; k++) {// i=5     ① i=0 실행안함  ②i=1
					if (num == lotto[k]) {                         //② num(첫번째 값) =lotto[1] 비교 같은지 
						flag = true;                    // ③값이 같으면 
						break;
					}
				}

				if (flag) { // ①flag= false      // ③값이 같으면 flag= true 실행
					i--;             //인덱스 감소해서 현재위치로 다시되돌아감, 다시 랜덤하게 숫자생성하고 중복을 없애기위해
					continue;
				}

				lotto[i] = num;
			}

			for (int i = 0; i < lotto.length; i++) {
				System.out.print(lotto[i] + " ");

			}
			System.out.println("\n------------------");
		}
	}
}
