package ch2.Variable;
import java.util.*;

public class Variable {
	public static void main(String[] args) {
		long a = 100l;
		byte by = 127;
		float b = 10.1f;
		char c = 65;
		double d = 10.33d;
		double e = 10e-3;
		float e1 = 123456789e-10f;
		
		String hello = "hello\b";

		System.out.println(a + 100);
		System.out.println("" + a + 100);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(hello);
		
		System.out.println(by + 1);
		System.out.println(e1);
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.printf("%d", num);
		scanner.close();
	}
}
