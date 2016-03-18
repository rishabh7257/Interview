import java.util.Arrays;
import java.util.Scanner;


public class Bubble {
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
	
	public void bubble() {
		for(int i= arry.length-1;i>0;i--) {
			for(int j=0;j<i;j++) {
				if(arry[j]>arry[j+1]) {
					swap(j,j+1,arry);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bubble b = new Bubble();
		b.input();
		b.print();
		b.bubble();
		b.print();
		
		
	}

}
