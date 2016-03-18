package StringReversal;

import java.util.Scanner;

public class removeCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Rishabh Sanghvi";
		System.out.println("Enter the character which you want to remove from the string");
		Scanner a = new Scanner (System.in);
		String remove = a.nextLine();
		String str2=str.replaceAll(remove, "");
		System.out.println("New String is "+str2);
	}

}
