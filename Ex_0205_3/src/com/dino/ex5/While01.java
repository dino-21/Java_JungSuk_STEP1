package com.dino.ex5;

public class While01 {
	public static void main(String[] args) {

		int sum = 0;
		int i = 1;

		boolean flag = true;


		while (flag) {
			sum = sum + i;
			i++;

	
			if (sum > 10000000)
				flag = false;

			System.out.println("while 누적합 : " + sum);
		}



	}
}
