package Array;

public class BubbleSortingInAscendingOrder2 {
public static void main(String[] args) {
	int[] arr = { 20, 10, 30, 50, 40, 70, 60  }; 
	for (int i = 0; i < arr.length-1; i++) {
		int pos = i;
		for (int j = i+1; j < arr.length; j++) {
			if (arr[i] > arr[j]) {
				pos=j;
			}
		}
		int temp = arr[pos];
		arr[pos] = arr[i];
		arr[i] = temp;
	}
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
		
	}
}
}
