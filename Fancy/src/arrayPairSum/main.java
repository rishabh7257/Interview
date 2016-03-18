package arrayPairSum;

public class main {

	public static int[] sort(int[] ary) {
		int temp = 0;
		int onemoretemp =0;
		for(int i=0;i<ary.length;i++) {
			for(int j=i;j<ary.length;j++) {
			if(ary[i]>ary[j]) {
					temp = ary[i];
					ary[i]=ary[j];
					ary[j]= temp;
				}
			}
		}
		return ary;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary = {5,3,1,9,6,2,7,4};
		int sumValue = 8;
		ary = sort(ary);
		/*for(int i:ary){
			System.out.printlsn(" "+i);
		}
		*/
		int sum=0;
		int left =0;
		int right = ary.length-1;
		//System.out.println(ary.length);
		//System.out.println(" "+left);
		//System.out.println(" "+right);
		while(left<right) {
			//System.out.println("left now"+ ary[left]);
			//System.out.println("right now"+ ary[right]);
			sum = ary[left]+ary[right];
			//System.out.println("Sum to compare"+sum);
			if(sumValue == sum) {
				System.out.println("Pair: "+ary[left]+"and "+ary[right]);
				left++;
			}
			else if (sumValue<sum) {
				right --;
				//System.out.println("left else if"+left);
				//System.out.println("right else if"+right);
				
			}
			else {
				left++;
				//System.out.println("left else"+left);
				//System.out.println("right else`"+right);
				
			}
		}
	}

}
