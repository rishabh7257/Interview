package maxTwoElement;

public class main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ary [] = {5,13,7,1,2,9};
		System.out.println("This program will help you find the max and second max");
		int max1 =0;
		int max2 =0;
		for (int comp: ary) {
			if(max2<comp) {
				max2 = comp;
					if(max2>max1) {
						int temp = max1;
						max1 = max2;
						max2 = temp;
					}
			}
		}
		System.out.println(max1+" " + max2);
		
	}

}
