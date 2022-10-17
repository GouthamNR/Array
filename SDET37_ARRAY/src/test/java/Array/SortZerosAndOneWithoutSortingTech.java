package Array;

public class SortZerosAndOneWithoutSortingTech {
public static void main(String[] args) {
	int[] a = {0, 1, 0, 1, 0, 1};
	int[] b = new int[a.length];
	int fIndex = 0;
	int lIndex= a.length-1;
		for (int i = 0; i < a.length; i++) {
		if (a[i] == 0) {
			b[fIndex]= a[i];
			fIndex++;
		}
		else {
			b[lIndex] = a[i];
			lIndex--;
		}
	}
		for (int i = 0; i < b.length; i++) {
         	System.out.print(b[i]+ " ");		
		}
}
}
