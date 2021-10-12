package ch4.Iteration.DoWhile;

public class Example2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			System.out.printf("i=%d ", i);
			
			int temp = i;
			
			do {
				// 일의 자리 수가 3으로 나누어 떨어지는지 확인 
				if(temp % 10 % 3 == 0 && temp % 10 != 0) {
					System.out.print("짝");
				}
				// 현재 일의 자리수를 빼고 숫자를 만든다. ex) 95 -> 9
			} while((temp/=10) != 0);

		}
	}

}
