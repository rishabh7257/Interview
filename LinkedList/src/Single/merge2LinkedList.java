package Single;

import Single.Definition.node;


public class merge2LinkedList {

public class node {
		
		Object value;
		node next;
		
		node (Object value, node next) {
			 
			 this.value = value;
			 this.next = next; 	
		 }
	}
	
	node header = new node (null,null);
	
	public void addFirst (Object x) {
		// TODO Auto-generated method stub
		
		if(header.value == null) {
			node temp =new node(x,null);
			header=temp;
		}
		else {
		node temp = new node(x,header);
		header = temp;
		
		}	
	}

	public void addLast(Object x) {
		// TODO Auto-generated method stub
		node temp =new node(x,null);
		temp = header;
		while(temp.next!=null){
			temp = temp.next;
		}
		node addnew = new node(x,null);
		temp.next = addnew;
		
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
	}
	public void deleteDuplicate(merge2LinkedList l1) {
		node outerScanner = new node(null,null);
		node innerScanner = new node(null,null);
		
		outerScanner = l1.header;
		while(outerScanner.next!=null) {
			innerScanner = outerScanner.next;
			if(outerScanner.value.equals(innerScanner.value)) {
				outerScanner.next = innerScanner.next;
				innerScanner = null;
			}
			else {
			outerScanner=outerScanner.next;
			}
		}
	}
	public void merge2LL(merge2LinkedList l1,merge2LinkedList l2) {
		node p1 = new node(null,null);
		node p2 = new node(null,null);
		node temp1 = new node(null,null);
		node temp2 = new node(null,null);
		p1 = l1.header;
		p2 = l2.header;
		while(p2!=null) {
			
			temp1 = p1.next;
			temp2 = p2.next;
			p1.next = p2;
			p2.next=temp1;
			
			p1 = temp1;
			p2 = temp2;
		}
	}
	
	public void reverseLL(merge2LinkedList l1) {
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		merge2LinkedList l1 = new merge2LinkedList();

	//	merge2LinkedList l2 = new merge2LinkedList();
		
		l1.addFirst(1);

		l1.addLast(1);

		l1.addLast(1);
		
		l1.addLast(2);

		l1.addLast(3);

		l1.addLast(3);
//		l1.merge2LL(l1, l2);
		l1.display();
		l1.deleteDuplicate(l1);
		System.out.println("");
		l1.display();
		
		
	}

}
