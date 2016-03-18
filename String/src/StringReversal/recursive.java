package StringReversal;

public class recursive {

	String reverse = "";
	public static String reverseRecursion(String str) {
		
		
		String reverse = "";
		 reverse += str.charAt(str.length()-1)
                 +reverseRecursion(str.substring(0,str.length()-1));
         return reverse;
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcdef";
		System.out.println(""+reverseRecursion(str));
	}

}
