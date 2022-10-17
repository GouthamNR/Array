package Array;

public class AddingTwoArrays {
public static void main(String[] args) {
	int[] a= {2, 3, 1, 4, 2};
	int[] b= {1, 2, 3, 1,9,7};
	int length = a.length;
	if (a.length<b.length) {
		length=b.length;
	}
	int[] c = new int[length];
	for (int i = 0; i < c.length; i++) {
		try 
		 {
			c[i]=a[i]+b[i];
			
		}
	catch (Exception e) {
		if (a.length>b.length) {
			c[i]=a[i];
		}
		else {
			c[i]=b[i];
		}
	}
	
	}
	System.out.print("Array a = ");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+ " ");
	}
	System.out.println();
	System.out.print("Array b = ");
	for (int i = 0; i < b.length; i++) {
		System.out.print(b[i]+ " ");
	}
	System.out.println();
	System.out.print("Array c = ");
	for (int i = 0; i < c.length; i++) {
		System.out.print(c[i]+ " ");
	}
}
}
