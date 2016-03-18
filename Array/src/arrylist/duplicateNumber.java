package arrylist;

import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.Set;
//import java.util.TreeSet;

public class duplicateNumber {
	
	public Integer findDuplicateNumber(List<Integer> numbers) {
		
		Set<Integer> hset = new TreeSet<Integer>();
		Integer temp=0;
		for(Integer i : numbers)
			{
			if(hset.contains(i)){
				System.out.println("Found: "+i);
				temp = i;
			}
			else{
				hset.add(i);
			}
		
		}
		return (temp);
	}
	
	public static void main(String a[]){
	        List<Integer> numbers = new ArrayList<Integer>();
	        for(int i=1;i<30;i++){
	            numbers.add(i);
	        }
	        //add duplicate number into the list
	        numbers.add(22);
	        duplicateNumber dn = new duplicateNumber();
	        System.out.println("Duplicate Number: "+dn.findDuplicateNumber(numbers));
	    }
	
}
