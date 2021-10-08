package ch2.Casting;

public class Example4 {
	public static void main(String[] args) {
		int i = 91234567;	// 8자리의 10진수
		float f = (float)i;	//	float는 7자리 까지의 정밀도를 갖는다.
		int i2 = (int)f;	//	float를 다시 int로 형변
		
		System.out.printf("i=%d\n", i);
		System.out.printf("f=%f\n", f);		// 8자리 정수를 실수로 변환하기 때문에 오차가 발생한다. 
		System.out.printf("i2=%d\n", i2);	// 오차가 발생한 실수를 정수로 변환했기 때문에 i와 i2는 다른 값을 갖는다.
		
		double d = (double)i;
		int i3 = (int)d;
		
		System.out.printf("d=%f\n", d);		// double은 15자리의 정밀도를 갖기 때문에 오차 없이 변환된다.
		System.out.printf("d=%f\n", i3);	// 오차가 없는 실수를 정수로 변환했기 때문에 i와 i3는 같은 값을 갖는다.
		
		float f2 = 1.666f;
		int i4 = (int)f2;
		
		System.out.printf("(int)%f=%d\n", f2, i4);	// 실수를 정수로 변환하면 소수점 이하의 수는 버려진다. 
	}

}
