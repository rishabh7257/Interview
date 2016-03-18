package StringReversal;

public class pallindrome {
	public static int pallindromeTest(String str) {
		char ch[] = str.toCharArray();
		boolean result = true;
		
		System.out.println("This program will check whether the string is pallindrome or not");
		
		for(int i=0;i<str.length()/2;i++) {
			if(!(ch[i]==ch[(str.length()-1)-i])) {
				result = false;
			}
		}
		if ((result))
			System.out.println("The string is pallindrome");
		else
			System.out.println("The string is not pallindrome");

		return(str.length());
	}
	
	public static int maximum(int[] strSize) {
		
		int max = 0;
		for(int i=0;i<strSize.length;i++) {
			int temp = 0;
			if(max<strSize[i]){
				max = strSize[i];
			}
			
		}
		
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] strSize = new int[4];
		strSize[0] = pallindromeTest("abba");
		strSize[1] = pallindromeTest("12321");
		strSize[2] = pallindromeTest("1234554321");
		strSize[3] = pallindromeTest("1121");
		
		System.out.println("Maximum pallindrome length is "+ maximum(strSize));
	}

}
