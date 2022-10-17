package Array;

public class ToCountHowManyTimesTheNumberIsRepeating {
	public static void main(String[] args) {
		int[] a = {4, 1, 1, 2, 3, 2};
		for (int i = 0; i < a.length; i++) {
			int temp = a[i];
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if (temp==a[j]) {
					count++;
				}
			}
			System.out.println(a[i] + " = "+ count);
		}
	}

}
