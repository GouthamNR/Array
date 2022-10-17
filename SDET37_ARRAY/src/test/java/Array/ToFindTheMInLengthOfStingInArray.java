package Array;

public class ToFindTheMInLengthOfStingInArray {
public static void main(String[] args) {
	String name="";
	int length = 0;
	String[] str = {"goutham", "nithin", "nanda", "neethasree", "viju"};
	for (int i = 0; i < str.length; i++) {
		for (int j = 1; j < str.length; j++) {
			if (str[i].length()>str[j].length()) {
				length=str[j].length();
				name=str[j];
			}
			
		}
	}
	System.out.println("min length of " + name + " is " + length);

String[] str1 = {"goutham", "nithin", "nanda", "neethasree", "viju"};
int length1=str1[0].length();
for (int i = 0; i < str1.length-1; i++) {
	if (length1>str1[i+1].length()) {
		length1=str[i+1].length();
	}
}
System.out.println("min length is : " + length1);
}
}
