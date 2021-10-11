package ch4.Condition.Switch;

import java.util.Scanner;

public class Example1 {
	public static void main(String[] args) {
		int result;

		Scanner scan = new Scanner(System.in);
		String temp = scan.nextLine();
		scan.close();
		result = Integer.parseInt(temp);

		switch (result) {
		case 1:
			System.out.println("result is 1");
			break;
		case 2:
			System.out.println("result is 2");
			break;
		case 3:
			System.out.println("result is 3");
			break;
		default:
			System.out.println("result is bigger than 3");
		}
	}

}
