package Array;

public class SwapTowNumbersWithUsingThirdVareable {
public static void main(String[] args) {
	int a=10;
	int b=20;
	int c = a;
	System.out.println("before Swap");
	System.out.println("a = " +a);
	System.out.println("b = " +b);
	a = b;
	b= c;
	System.out.println("after Swap");
	System.out.println("a = " +a);
	System.out.println("b = " +b);
}
}
