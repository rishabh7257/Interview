package removeDuplicateUsingLinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class removeDuplicate {

	public class node {
		
		Object value;
		node next;
		
		node (Object value, node next) {
			 
			 this.value = value;
			 this.next = next; 	
		 }
	}
	
	node header = new node(null,null);
	
	public removeDuplicate() {
		node header = new node(null,null);
	}
	public void add (Object x) {
		// TODO Auto-generated method stub
		
		if(header.value == null) {
			node temp =new node(x,null);
			header=temp;
		}
		
		else {
			node runner = header;
			node temp = new node(x,null);
			while(runner!=null && runner.next!=null) {
				runner = runner.next;
			}
			runner.next = temp;

		}	
	}
	public void display() {
		node temp = new node(null,null);
		temp = header;
		if(temp == null) {
			System.out.println("The list is empty");
		}
		
		do {
			System.out.println(""+temp.value);
			temp = temp.next;
		} while((temp)!= null); 
			
		//System.out.println("b"+ header.value);
	}
	public void removeDup() {
		LinkedHashSet<Object> hs = new LinkedHashSet<Object>();
		node adder = header;
		while(adder!=null) {
			hs.add(adder.value);
			adder=adder.next;
		}
		Iterator<Object> itr = hs.iterator();
		
		header.value = itr.next();
		header.next = null;
		
		while(itr.hasNext()) {
			node adding = new node(itr.next(),null);
			node runner = header;
			while(runner.next!=null) {
				runner = runner.next;
			}
			runner.next = adding;
			
		}	
		
	}
	public void repeatAfterKNode(node runner,int n) {
		
		node prerunner = null;
		node current = runner;
		node next = null;
		node prev = prerunner;
		int count = 0;
		
		while(runner.next!=null && count<n) {
			
				next = current.next;
				current.next=prev;
				prev = current;
				current = next;
				
			
			runner=runner.next;
			prerunner=runner;
			count++;
			
		}
		repeatAfterKNode(current, 2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		removeDuplicate l = new removeDuplicate();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(6);
		//l.add(6);
		l.add(7);
		l.add(8);
		//l.repeatAfterKNode(l.header,2);
		//l.removeDup();
		l.display();
		
	}

}
