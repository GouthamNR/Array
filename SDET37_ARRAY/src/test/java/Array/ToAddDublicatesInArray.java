package Array;

import java.util.LinkedHashSet;

public class ToAddDublicatesInArray {
public static void main(String[] args) {
	int[] a = {1,2,1,2,3,5,3,7,4,1,8,8,8};
	int[] b = new int[a.length];
	int j=0;
	LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
	for (int i = 0; i < a.length; i++) {
		set.add(a[i]);
	}
	for (Integer num : set) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			if (num==a[i]) {
				sum=sum+a[i];
			}
		}
		System.out.print(sum+ " ");
	}

}
}
