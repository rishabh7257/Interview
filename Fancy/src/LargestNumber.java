import java.util.*;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = {4,98,12,31};
		
		List<String> list = new ArrayList<String>();
		
		for(int i = 0; i<input.length;i++) {
			
			list.add(""+input[i]);
			
		}
		
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				String leftToRight = o1 + o2;
				String rightToLeft = o2 + o1;
				System.out.println("o1 " + o1);
				System.out.println("o2 " + o2);
				return -leftToRight.compareTo(rightToLeft);				
			}
			
			
		});
		
		StringBuilder result = new StringBuilder();
		
		for (String str : list) {
			result.append(str);
		}
		
		System.out.println("Largest String is: " + result.toString());
		
		
	}

}
