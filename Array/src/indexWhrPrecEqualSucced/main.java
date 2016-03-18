package indexWhrPrecEqualSucced;

public class main {

	public static int sum(int [] ary,int sp, int ep) {
		
		int sum = 0;
		for(int i = sp;i<=ep;i++) {
			sum = sum + ary[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		
		int ary[] = {4,3,1,2,10,20};
		System.out.println("This program will print the index value at which the sum of preceeding and succeding value is same");
		int leftSum = 0, rightSum = 0;
		int size = ary.length-1;
		int start = 0;
		int index = 1;
		for(int i =0;i<ary.length;i++) {
			leftSum = sum(ary,0,index);
			rightSum = sum(ary,index+1,size);
			if(leftSum==rightSum) {
				break;
			}
			index++;
			}
		System.out.println("Sum of value before and on "+index+" is equal to sum of value after");
		}

}
