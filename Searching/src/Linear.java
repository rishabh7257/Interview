import java.util.Scanner;

class Linear{
	
	 static void Search(int key, int[] ary){
		int i=0;
		while(ary[i] != key){
			i++;
			if(i==ary.length) {
				break;
			}
		}
		System.out.println("We found the element at " +i +"position");
	 }
	 
	public int[] input(){
		 Scanner a = new Scanner (System.in);
		 int[] ary = new int[5];
			
		 System.out.println("Enter the number in array");
			for(int i=0;i<6;i++)
				{ary[i]= a.nextInt();}
			return(ary);
	 }


	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		int[] ary = {1,2,3,4,5};
		//ary = ls.input();
		Search(6,ary);

	}
}



