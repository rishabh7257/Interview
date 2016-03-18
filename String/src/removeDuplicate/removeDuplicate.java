package removeDuplicate;

import java.util.HashSet;

public class removeDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "bananasbabababa";
		
		char[] chars = input.toCharArray();
	    HashSet<Character> charz = new HashSet<Character>();

	    for(Character c : chars )
	    {
	        if(!(charz.contains(c)))
	        {
	            charz.add(c);
	            System.out.print(c);
	        }
	    }

	    for(Character c : charz)
	    {
	       //System.out.print(c);
	    }

	}
}
