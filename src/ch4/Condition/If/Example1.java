package ch4.Condition.If;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {		
		int input;
		
		Scanner scanner = new Scanner(System.in);
		String temp= scanner.nextLine();
		scanner.close();
		
		input = Integer.parseInt(temp);
		
		// if else 구문 
		if (input == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		else {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}
		
		// if else if 구문
		if (input > 10) {
			System.out.println("입력하신 숫자는 10보다 큽니다.");
		} else if (input > 5) {
			System.out.println("입력하신 숫자는 10보다는 작거나 같고 5보다 큽니다.");
		} else if (input > 1) {
			System.out.println("입력하신 숫자는 5보다는 작거나 같고 1보다 큽니다.");
		} else {
			System.out.println("입력하신 숫자는 1보다 작거나 같습니다.");
		}
	}

}
