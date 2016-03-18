package removeDuplicate;

public class removeDuplicateWithoutExtraBuffer {

	public static void removeDuplicate(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					str = str.substring(0, j) + str.substring(j + 1);
					i--;
					break;
					
					
					
				}
			}
		}
		System.out.println("String without any duplciate is "+str);
		
	}
	public static void main(String[] args) {
		String str = "swaatiaaaawawassawawtststatsstattasasasatssatatsastasatasattttaaaasssssssss";
				removeDuplicate(str);
	}

}
