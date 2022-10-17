package Array;

public class FindFirstMaxNumWithouthUsingSorting {
public static void main(String[] args) {
	int[] arr = { 20, 10, 30, 50, 40, 70, 60  }; 
	int FirstMax = arr[0];
	for (int i = 0; i < arr.length; i++) {
		if (FirstMax < arr[i]) {
			FirstMax = arr[i];
		}
	}
	System.out.println("The fisr Max Num Is : " + FirstMax);
}
}
