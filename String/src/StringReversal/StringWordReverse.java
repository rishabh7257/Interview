package StringReversal;

public class StringWordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Rishabh Sanghvi India";
		String[] ary = a.split(" ");
		
		for(int i=0;i<ary.length;i++) {
			
			char[] temp = ary[i].toCharArray();
			
			int k = temp.length-1;
			char[] out = new char[k+1];
			for(int j=0;j<temp.length;j++,k--) {
				
				out[j]=temp[k];
				//System.out.print(""+out[j]);
				}
			ary[i]=new String(out);
			//System.out.println(""+temp[0]);
		}
	
	for(int i=0;i<ary.length;i++) {
		System.out.print(""+ary[i]);
		System.out.print(" ");
	}

}
}