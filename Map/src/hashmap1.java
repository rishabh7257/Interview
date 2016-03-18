import java.util.*;

class hashmap1 {
	public static void main(String args[]) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		
		Set s = hm.entrySet();
		
		for(Object o:s) {
			System.out.println(o);
		}
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		String name = "Swati";
		try{
		Integer i = Integer.parseInt(name);
		} catch(Exception e) {}
		System.out.println();
	
		
	}
}