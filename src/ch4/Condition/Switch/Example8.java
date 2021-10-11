package ch4.Condition.Switch;

import java.util.Scanner;

public class Example8 {
	public static void main(String[] args) {
		String regNo;
		
		Scanner scanner = new Scanner(System.in);
		regNo = scanner.nextLine();
		
		char gender = regNo.charAt(6);
		
		System.out.println("your gender is " + gender);
		
		switch (gender) {
		case '1':
		case '3':
			System.out.println("You are Man!");
			break;
		case '2':
		case '4':
			System.out.println("You are Women!");
		default:
			System.out.println("I dont know who you are..");
		}
	}
}
