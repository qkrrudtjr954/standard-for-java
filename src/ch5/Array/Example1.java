package ch5.Array;

public class Example1 {
	public static void main(String[] args) {
		int[] arr = new int[5];

//		int i = 0;
//		
//		for (int elem:arr) {
//			elem = i;
//			i ++;
//		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}

		for (int elem : arr) {
			System.out.println(elem);
		}
		
		System.out.println(arr[8]);
	}

}
