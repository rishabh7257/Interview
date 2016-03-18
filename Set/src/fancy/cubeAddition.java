package fancy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class cubeAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <Integer> cubeAdd = new HashSet<Integer>();
		for(int i =1;i<5;i++) {
			cubeAdd.add(i);
		}
		Iterator<Integer> it = null;
		it = cubeAdd.iterator();
		int sum = 0;
		System.out.println(it.next().getClass());
		System.out.println("Below are the series whose cube sum we are be doing today");
		while(it.hasNext()) {
			int temp = (int)it.next();
			sum = sum + (temp*temp*temp);
			
		}
		System.out.println(sum);
	}

}
