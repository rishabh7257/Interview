package Double;

import java.util.Scanner;

public class Definition {
	
	public class node {
		
		Object value;
		node next;
		node prev;
		
		node (Object value, node prev, node next) {
			 
			 this.value = value;
			 this.next = next; 	
			 this.prev = prev;
		 }
	}
	
	node header = new node (null,null,null);
	node temp = new node (null,null,null);
	node current = new node (null,null,null);
	node next = new node (null,null,null);
	
	
	int count = 0;
	
	public void addNode (Object x) {
		// TODO Auto-generated method stub
		
		if(header.value ==null) {
			node newNode = new node (x,null,null);
			header = newNode;
			
		} else {
			
			temp = header;
			while(temp.next!=null) {
				temp = temp.next;
				
			}
			node newNode = new node (x,temp,null);
			temp.next = newNode;
			
		}
		
	}

	
	public void insert(Object x, int after) {
		// TODO Auto-generated method stub
		System.out.println("By this method we will insert the object after n node");
		temp = header;
		for(int i =0;i<after-1;i++) {
			temp = temp.next;
		}
		node newNode = new node(x,temp,temp.next);
		temp.next = newNode;
	}

	
	public void delete(Object x) {
		// TODO Auto-generated method stub
		if(search(x)) {
			temp = header;
			while(temp.value!=x) {
				temp = temp.next;	
			}
			current = temp.prev;
			next = temp.next;
			current.next = next;
			next.prev = current;
			
			System.out.println("Element got deleted!!");
		} else {
			System.out.println("The element didn't found!");
		}
		
	}

	public boolean search(Object x) {
		// TODO Auto-generated method stub
		temp = header;
		while((temp.next!=null)&&(temp.value!=x)) {
			temp = temp.next;
		}
		if(temp.value == x){
		return true;
		} else {
			return false;
		}
		
	}

	public void display() {
		if(header.value==null) {
			System.out.println("The list is empty");
			
		}
		else {
			temp = header;
			do{
				System.out.println("The element is "+temp.value);
				temp = temp.next;
			}while(temp!=null);
			
		}
	}
	public void deleteAlternate() {
		temp = header;
		node currentNext = new node (null,null,null);
		while((temp.next!=null)&&(temp!=null)) {
			current = temp.next;
			if(current.next==null) {
				temp.next = null;
			}
			else {
				currentNext = current.next;
				temp.next = current.next;
				currentNext.prev = temp;
				current = null;
				temp = temp.next;
				temp = temp.next;
			}
			
			
		}
		
		
	}
}
