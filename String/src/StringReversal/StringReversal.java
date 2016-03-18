package StringReversal;
//Program to completely reverse the string.
public class StringReversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Rishabh Sanghvi";
		
		char [] ch = a.toCharArray();
		int k = ch.length-1;
		for(int i =0;i<k;i++,k--) {
			
				char temp;
				temp = ch[i];
				ch[i] = ch[k];
				ch[k] = temp;
			
				
			}
		a = ch.toString();
		for(int i =0;i<ch.length;i++) {
			
			System.out.print(""+ch[i]);
			
		}
		}
}
		
		



