package Array;

public class SumOfFirst3MinNum {
public static void main(String[] args) {
	int sum=0;
	int[] arr = { 20, 10, 30, 50, 40, 70, 60  }; 
	
	for (int i = 0; i < arr.length-1; i++) {
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i] > arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	
	for (int i = 0; i < 3; i++) {
		sum = sum+arr[i];
	}
	System.out.println("sum of first 3 min num is " + sum);
}
}
