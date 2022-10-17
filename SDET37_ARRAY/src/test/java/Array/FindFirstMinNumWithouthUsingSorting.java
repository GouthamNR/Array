package Array;

public class FindFirstMinNumWithouthUsingSorting {
public static void main(String[] args) {
	int[] arr = { 20, 10, 30, 50, 40, 70, 60  }; 
	int min = arr[0];
	for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
	System.out.println("the fist min num is : " + min );
  }
}
