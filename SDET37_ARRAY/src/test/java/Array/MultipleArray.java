package Array;

public class MultipleArray {
public static void main(String[] args) {
	int maxSum = 0;
	int[][] a = {{1,2,3}, {4,5,6}, {7,8,9}};
	for (int i = 0; i < a.length; i++) {
		int[] b= a[i];
		int n =0;
		for (int j = 0; j < b.length; j++) {
			n = n+b[j];
		}
		if (maxSum<n) {
			maxSum=n;
		}
	}
	for (int i = 0; i < a.length; i++) {
		int[] b= a[i];
		int n =0;
		for (int j = 0; j < b.length; j++) {
			n = n+b[j];
		}
		if (n==maxSum) {
			System.out.println("");
			System.out.print("{ ");
			for (int k = 0; k < b.length; k++) {
				System.out.print(b[k]+ " ");
			}
			System.out.print(" }");
		}
	}
	
}
}
