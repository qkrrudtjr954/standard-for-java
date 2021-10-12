package ch4.Iteration.For;

public class Example1 {
	public static void main(String[] args) {
		// 일반 for 문 
		for (int i = 1; i < 10; i++) {
			System.out.printf("i=%d\n", i);
		}
		
		// 변수를 두 개 초기화하는 for 문
		for (int i = 1, j = 10; i < 10 || j > 0; i++, j--) {
			System.out.printf("i=%d,j=%d\n", i, j);
		}
		
		// 향상된 for 문 
		int[] arr = {1, 2, 3, 4, 5};

		for(int num: arr) {
		  System.out.println(num);
		}
	}
}
