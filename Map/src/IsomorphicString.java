import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {

	public static void main(String[] args) {

		System.out.println("The string egg and add are isomorphic " + isIsomorphic("for","aad"));
	}
	
	public static boolean isIsomorphic(String s, String t) {
		
		Map<Character, Character> map = new HashMap<Character, Character>();
		
		if (s == null) 
			return false;
		
		if (t == null)
			return false;
		
		if (s.length() != t.length()) 
			return false;
		
		if (s == t) 
			return true;
		
		for (int i = 0; i<s.length(); i++) {

			if (map.containsKey(s.charAt(i))) {
				
				if (map.get(s.charAt(i)) == t.charAt(i)) {
					continue;
					
				} else {
					return false;
					
				}
					
					
			} else if (map.containsValue(t.charAt(i))){
				
				return false;
				
			} else {
				
				map.put(s.charAt(i), t.charAt(i));
			}

			
		}
		
		return true;
	}

}
