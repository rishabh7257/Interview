public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] input = {"Hello", "HelloMan", "Hell", "Hellan"};
		String result = getLongestCommonPrefix(input);
		System.out.println("Result is " + result);
		
	}
	
	public static String getLongestCommonPrefix(String[] input) {
		
		int minimumLength = Integer.MAX_VALUE;
		
		for(String str : input) {
			if (str.length() < minimumLength) {
				minimumLength = str.length();
			}
		}
		
		char[] charList = new char[minimumLength];
		
		for (int i = 0; i<minimumLength ; i++) {
			Character c = input[0].charAt(i);
				
			for(String str : input) {
						
				if (str.charAt(i) == c) {
					c = str.charAt(i);
				} else {
					return (new String(charList));
				}
			}	
			if (c != null) {
				charList[i] = c;
			}
			
		}
		
		return (new String(charList));
	}

}
