package allUniqueCharacter;

import java.util.HashSet;
import java.util.Set;

public class main {

	public static boolean unique(String str) {
		char ch[] = str.toCharArray();
		Set<Character> charz = new HashSet<Character>();
		for(Character c: ch) {
			//if(!(charz.contains(c))) {
				charz.add(c);
			//}
		}
		System.out.println("Character Size "+ch.length);

		System.out.println("Set Size "+charz.size());
		if(ch.length==charz.size())
			return true;
		else
			return false;
		
	}
	public static void main(String[] args) {
		
		String str1 = "My Name is Rishabh Sanghvi";
		String str2 = "Risab Snghv";
		int i = str1.charAt(1);
		System.out.println("Interger ar: "+i);

		
		System.out.println("String 1: "+str1+" "+unique(str1));

		System.out.println("String 2: "+str2+" "+unique(str2));

	}

}
