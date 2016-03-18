import java.util.Scanner;


public class Selection {
	Scanner a = new Scanner (System.in);
	int arry[];
	int size = 0;
	
	public void input () {
		
		System.out.println("Please enter the size of array:" );
		size= a.nextInt();
		arry = new int[size];
		for(int i =0;i<size;i++) {
			System.out.println("Please enter the values which need to be sorted:" );
			arry[i]= a.nextInt();
			}
	}
	
	public void print() {
		
		for(int i =0;i<size;i++) {
			System.out.println("Value of array is:" +arry[i]);
			}
		System.out.println("");
	}
	
	public void swap(int a,int b,int[] arry) {
		
		int temp;
		temp = arry[a];
		arry[a]=arry[b];
		arry[b]=temp;
		
	}
	
	public void selection() {
		
		//int temp = 10;
		int index = 0;
		for (int i=0;i<arry.length;i++) {
			
			index = i;
			for(int j=i;j<arry.length;j++) {
				if(arry[j]<arry[index]) {
					index = j;
				//	temp = arry[j];
					
				}
			}
			
			int temp1;
			temp1 = arry[index];
			arry[index]=arry[i];
			arry[i]=temp1;
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Selection s = new Selection();
		s.input();
		s.print();
		s.selection();
		s.print();
		
		
	}

}


