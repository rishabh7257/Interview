
public class BinarySearch {
	
	public static void Binary(int []input, int key) {
		int first = 0;
		int last = input.length-1;
		int mid = (first+last)/2;
		
		while(first<last) {
			if(input[mid]==key) {
				
				break;
				
			}
			else if(input[mid]<key) {
				first = mid+1;
				mid = (first+last)/2;
			}
			else {
				last = mid -1;
				mid = (first+last)/2;
			}
				
		}
		if(input[mid]==key) {
			System.out.println("Found at "+(mid+1)+ " Position");
		}
		else
			System.out.println("Not Found");
	}

	public static void main(String[] args) {

		int ary [] = {1,2,3,4,5,6,7,8,9,10};
		int key = 10;
		Binary(ary,key);
		
	}

}
