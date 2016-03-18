
public class BinarySearchRecursive {
	
	public static void Binary(int []input, int first,int last,int key) {
		int mid = 0;
	
		while(first<=last) {
			mid = (first+last)/2;
			
			if(input[mid]==key) {
				System.out.println("Found at "+(mid+1)+ " Position");
				System.exit(0);
				break;
				
				
			}
			else if(input[mid]<key) {
				first = mid+1;
				Binary(input,first,last,key);
				
			}
			else {
				last = mid -1;
				Binary(input,first,last,key);
				
			}
				
		}
		if(input[mid]!=key) {
		
			System.out.println("Not Found");
			System.exit(0);
		}
	}

	public static void main(String[] args) {

		int ary [] = {1,2,3,4,5,6,7,8,9,10};
		int key = 11;
		Binary(ary,0,ary.length-1,key);
		
	}

}
