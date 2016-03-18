import java.util.Scanner;


public class Merge {

	Scanner a = new Scanner (System.in);
	int arry[] = new int[50];
	int size = 0;
	
	public void input () {
		
		System.out.println("Please enter the size of array:" );
		size= a.nextInt();
		
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
	
	public void merge() {
		
		int temp = size;
		for(int i =0;i<size;i++) {
			int least=i;
			
			for(int j=i+1;j<size;j++) {
				
				if(arry[i]>arry[j]) {

					least=j;
				}
			}
			int temp1;
			temp1 = arry[i];
			arry[i]=arry[least];
			arry[least]=temp1;
			print();
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Merge m = new Merge();
		m.input();
		m.print();
		m.merge();
		m.print();
		
	}

}


