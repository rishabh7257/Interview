import java.util.Scanner;


public class recursion {

	public static int factorial(int num) {
		int temp = 1;
		while(num!=0){
			
			temp = temp * num;
			num--;
			
			
		}
		return temp;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner (System.in);
		System.out.println("Enter the number of which you want the factorial ");
		int num = a.nextInt();
		System.out.println("Answer is "+factorial(num));
		
		

	}

}
