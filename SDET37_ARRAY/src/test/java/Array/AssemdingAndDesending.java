package Array;

public class AssemdingAndDesending {
public static void main(String[] args) {
	int[] arr = { 20, 10, 30, 50, 40, 70, 60  }; 
	
	System.out.println(" Before Sort ");
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+ " ");
	}
	System.out.println();
	System.out.println("After Sort : asending");
	for (int i = 0; i < arr.length-1; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i]  > arr[j]) {
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		System.out.print(arr[i]+ " ");
	}
	
	System.out.println();
	System.out.println("After Sort : desending");
	for (int i = 0; i < arr.length-1; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i]  < arr[j]) {
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		System.out.print(arr[i]+ " ");
	}
}
}
