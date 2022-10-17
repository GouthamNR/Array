package Array;

public class FindSecondMinNumWithouthUsingSorting {
	public static void main(String[] args) {
		int[] arr = { 20, 10, 30, 50, 40, 70, 60  }; 
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
				if (min > arr[i]) {
					min = arr[i];
				}
			}
		int secondMin = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (secondMin > arr[i] && arr[i]>min) {
				secondMin = arr[i];
			}
		}
		System.out.println("The Fist Min Num is : " + min );
		System.out.println("The Second Min Num Is : " + secondMin);
	  }
}
