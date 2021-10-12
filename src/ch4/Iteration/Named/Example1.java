package ch4.Iteration.Named;

public class Example1 {
	public static void main(String[] args) {
		Loop1: for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 5)
//					break Loop1;	// 가장 상위 for문에 Loop1을 지정해주었기 때문에 j가 5가 될 때, for 문 전체가 종료된다.
//					break;			// j가 5가 될 때, 가장 가까운 for문이 종료된다. (j를 증가시키는 for문)
//					continue Loop1;	// j가 5가 될 때, 이후 동작을 무시하고 Loop1을 다시 시작한다. -> j가 5 이후의 구구단은 출력 x
					continue;		// j가 5가 될 때, 가장 가까운 for문을 다시 시작한다. -> j가 5인 구구단만 출력 x
				
				System.out.printf("%d x %d = %d \n", i, j, i*j);
			}
		}
	}

}
