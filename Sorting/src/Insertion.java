import java.util.Scanner;


public class Insertion {
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
	
	public void search() {
		
	}
	
	public void insertion() {
		
		for(int i=0;i<arry.length;i++) {
			
			for(int j=i;j>0;j--) {
				
				if(arry[j]<arry[j-1]) {
					swap(j,j-1,arry);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Insertion s = new Insertion();
		s.input();
		s.print();
		s.insertion();
		s.print();
		
		
		
	}

}

/*for(int i=0;i<size-1;i++) {
	
	for(int j=i+1;i>-1;j--,i--) {
		
		if(arry[j]<arry[i]) {
			
			int temp=0;
			temp=arry[i];
			arry[i]=arry[j];
			arry[j]=temp;
			System.out.println("I");
		}
	}

	
}
System.out.println("K");
*/


