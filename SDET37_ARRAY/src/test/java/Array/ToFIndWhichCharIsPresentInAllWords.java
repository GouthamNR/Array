package Array;

public class ToFIndWhichCharIsPresentInAllWords {
public static void main(String[] args) {
	String[] s= {"abc", "bca", "dea","fga"};
	for (int i = 0; i < s.length; i++) {
		//int count=0;
	  String word= s[i];//abc
	  for (int j = 0; j < word.length(); j++) {
		Character ch = word.charAt(j);//a
		String sCh = String.valueOf(ch);
		int count=0;
		for (int k = 0; k < s.length; k++) {
			String word1=s[k];
			if (word1.contains(sCh)) {
				count++;
			}
	
		}
		if (count==s.length) {
			System.out.println(sCh);
		}
		
	}
	}
}
}
