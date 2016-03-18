package ArryListSort;

import java.util.Scanner;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("Enter the number of elements in array");
		int N = sc.nextInt();
		int[] ar1 = new int[N];
		int[] ar2 = new int[N];
		
		System.out.print("Enter the elements of first Array");
		for (int i = 0; i< N; i++) {
			ar1[i] = sc.nextInt();
		}
		
		System.out.print("Enter the elements of Second Array");
		for (int i = 0; i< N; i++) {
			ar2[i] = sc.nextInt();
		}
		
		System.out.print("Median of the sorted array is " + getmedian(ar1, ar2, N));
		
	}
	
	public static int getmedian(int[] ar1, int[] ar2, int N) {
		
		
		return getmedian(ar1, 0, ar1.length-1, ar2, 0, ar2.length-1);
	}

	public static int getmedian(int[] ar1, int m, int n, int[] ar2, int x, int y) {
		
		int mid1 = (m + n)/2;
		int mid2 = (x + y)/2;
		
		if (n - m == 1)
            return (Math.max(ar1[m] , ar2[x]) + Math.min(ar1[n] , ar2[y]))/2;
       
		if (ar1[mid1] < ar2[mid2]) {
			
			return getmedian(ar1, mid1, n, ar2, x, mid2);
		} else {
			return getmedian(ar1, m, mid2, ar2, mid2, y);
		}
	}
}
