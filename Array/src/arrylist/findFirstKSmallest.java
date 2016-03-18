package arrylist;

import java.util.Scanner;

public class findFirstKSmallest {

	public static int[] remove(int[]a,int index) {
		
		if(index ==a.length-1) {
			a[a.length-1] = '\0';
		}
		else {
		for(int i =index;i<a.length-1;i++) {
			
			a[i]=a[i+1];
		}
		a[a.length-1]='\0';
		}
		return a;
	}
	private static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {1,15,12,3,20,-1,0,-23};
		
		input = new Scanner(System.in);
		int k = input.nextInt();
		int output[] = new int[k];
		int index = 0;
		int temp = 1000;
		int len = a.length;
		for(int i = 0;i<k;i++) {
			for(int j=0;j<len;j++) {
				
				if(a[j]<temp) {
					temp = a[j];
					index = j;
				}
			}
			output[i] = temp;
			a=remove(a,index);
			len--;
			temp = a[0];
		}
		for(int x : output) {
			System.out.println(" "+x);
		}
		

	}

}
