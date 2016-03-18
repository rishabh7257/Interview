package removeDuplicate;

public class removeAdjacentDuplicate {


	public static void removeDuplicate(String str) {
		str = str +"  ";
		boolean flag = true;
		for(int i=0;i<str.length();i++) {
			while(flag){
			if(str.charAt(i)==str.charAt(i+1)) {
				str = str.substring(0, i) + str.substring(i + 1);
				flag = false;
				if(str.charAt(i)== str.charAt(i+1)) {
					flag = true;
					}
				else flag = false;
				
				}
			}
		}
		System.out.println("String without any duplciate is "+str);
		
	}
	public static void main(String[] args) {
		
		String str = "aaabbccddeffghha";
		removeDuplicate(str);
		
	}

}
