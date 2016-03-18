import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class NumberOfBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Number of 1 bit in 6 is " + hammingWeight(11));
	}

	public static int hammingWeight(int n) {
		
		int count = 0;
		int temp = 0;
		while (n > 0) {
			
			temp = n & 1;
			if (temp == 1) {
				count ++;
			}
			
			n = n >> 1;
			
		}
		return count;
		
	}
	
//	public static int reverseBit(int n) {
//		
//		int temp = 0;
//		int index = 0;
//		List list = new LinkedList<>();
//		while (n > 0) {
//			temp = n | 0;
//			n = n >> 1;
//			list.add(temp);
//		}
//		
//		Iterator iterator = list.iterator();
//		for()
//		return 0;
//	}
}
