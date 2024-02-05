package com.dino.ex1;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {

		int a = 3, b = 4, c = 5;
		int d = (a + b) * c;

		System.out.println(d);

		/*
		 * <실행결과>
		 * 
		 * 문자열 입력(공백이 있어도 된다.) : Java Book 
		 * 
		 * 출력 결과 : Java Book
		 */

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 입력 : ");
		String msg = sc.nextLine();

		System.out.println("출력 결과 : " + msg);
	}
}
