package StringReversal;

public class mainCString {

	public static void reverse (String str) {
		char ch[] = str.toCharArray();
		char newCh[] = new char[ch.length];
		int i = 0 ;
		System.out.println("Length of the string is "+ch.length);
		
		for (i=ch.length-2;i>-1;i--) {
			System.out.println("Reversed String is "+ch[i]);
			
		
		}
	}
	public static void main(String[] args) {
		
		String str = "abcd"+"\0";
		System.out.println("String is "+str);
		
		reverse(str);
	}

}
