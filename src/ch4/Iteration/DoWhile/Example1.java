package ch4.Iteration.DoWhile;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		int input = 0, answer = 0;

		answer = (int) (Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("1과 100 사이의 정수를 입력하세요.>");
			input = scanner.nextInt();

			if (input < answer) {
				System.out.println("UP");
			}
			if (input > answer) {
				System.out.println("DOWN");
			}
		} while ((input != answer));
	}

}
