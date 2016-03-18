package isSubString;

public class main {

	public static void isSubStringCheck(String str1, String str2) {
		int length1 = str1.length();
		int length2 = str2.length();
		int count=0;
		boolean flag = false;
		if(length1<=length2) {
			
			for(int i=0;i<length2;i++) {
				
				if(str1.charAt(0)==str2.charAt(i)) {
					count = 0;
					int temp = i;
					for(int j=0;j<length1;j++) {
						if((str1.charAt(j) == str2.charAt(i))) {
							System.out.println("i and j "+i+" "+j);
							//System.out.println("Str = "+str2.charAt(i));
							i++;
							count++;
							if(count==length1) {
								flag = true;
								break;
							}
						}
					}
					i = temp;
				}
			}
		}
		System.out.println("Count = "+count);
		if(flag) {
			System.out.println("Yes");
		}
		else 
			System.out.println("No");
	}
	public static void main(String[] args) {
		
		String str1 = "mangoapl";
		String str2 = "abcmangoaplplelemon";
		isSubStringCheck(str1,str2);
	}
}
