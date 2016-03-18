package temp;

import java.util.ArrayList;
import java.util.ListIterator;

public class hashset {

	
	public static void main(String args[]){

	ArrayList<String> al=new ArrayList<String>();
	al.add("Amit");
	al.add("Vijay");
	al.add("Kumar");
	al.add(1,"Sachin");
	try{
	System.out.println("element at 2nd position: "+al.get(3));
	}catch(Exception e){
	System.out.println(e);
	}
	ListIterator<String> itr=al.listIterator();

	System.out.println("traversing elements in forward direction...");
	while(itr.hasNext()){
	System.out.println(itr.next());
	 }


	System.out.println("traversing elements in backward direction...");
	while(itr.hasPrevious()){
	System.out.println(itr.previous());
	 }
	}
	
}



