package ch4.Iteration.While;

public class Example1 {
	public static void main(String[] args) {
		// 일반 while 문 
		// 초기화
		int i = 0;

		// 증감식 + 조건식
		while (i++ < 10) {
			System.out.printf("i=%d\n", i);
		}
		
		// flag를 사용한 while 문 제어 
		int j = 10;
		boolean flag = true;

		while (flag) {
			System.out.printf("j=%d\n", j);
			if (j == 0) {
				// 조건식의 flag를 false로 만든다 
				flag = false;
			} else {
				j--;
			}
		}

	}

}
