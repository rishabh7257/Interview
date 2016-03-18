import java.util.Scanner;


public class quick {
	
	Scanner a = new Scanner (System.in);
	static int arry[];
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
	
	int partition(int arry[], int left, int right) {
		int i = left;
		int j = right;
		
		int pivotHelp = (i+j)/2;
		int pivot = arry[pivotHelp];
		while(i<j) {
			if(arry[i]<pivot) {
				i++;
			}
			if(arry[j] > pivot) {
				j--;
			}
			if(i<=j) {
				int temp;
				temp = arry[i];
				arry[i]=arry[j];
				arry[j]=temp;
				j--;
				i++;
			}
		}
		
		return i;
	}
	 
	void quickSort(int arry[], int left, int right) {
		int index = partition(arry,left,right);
		if(left<index-1) {
			quickSort(arry,left,index-1);
		}
		if(right>index) {
			quickSort(arry,index,right);
		}
		
	     
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		quick s = new quick();
		s.input();
		s.print();
		s.quickSort(arry,0,arry.length-1);
		s.print();
	}

}

