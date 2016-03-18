package Single;

import java.util.Scanner;

 
// Definition for binary tree


public class Definition implements LinkedList {
	
	class TreeNode {
		Object val;
		TreeNode left;
		TreeNode right;
	 
		TreeNode(Object x) {
			val = x;
		}
	}
	 
class Solution {
	node h;
 
	public TreeNode sortedListToBST(node head) {
		if (head == null)
			return null;
 
		h = head;
		int len = 5;
		return sortedListToBST(0, len - 1);
	}
 
	// get list length
	public int getLength(node head) {
		int len = 0;
		node p = head;
 
		while (p != null) {
			len++;
			p = p.next;
		}
		return len;
	}
 
	// build tree bottom-up
	public TreeNode sortedListToBST(int start, int end) {
		if (start > end)
			return null;
 
		// mid
		int mid = (start + end) / 2;
 
		TreeNode left = sortedListToBST(start, mid - 1);
		TreeNode root = new TreeNode(h.value);
		h = h.next;
		TreeNode right = sortedListToBST(mid + 1, end);
 
		root.left = left;
		root.right = right;
 
		return root;
	}
}
	public class node {
		
		Object value;
		node next;
		
		node (Object value, node next) {
			 
			 this.value = value;
			 this.next = next; 	
		 }
	}
	
	node header = new node (null,null);
	
	int count = 0;
	
	public void removeDuplicate() {
		
		node runner = new node(null,null);
		node prevRunner = new node(null,null);
		node scanner = new node(null,null);
		node temp = new node(null,null);
		scanner = header;
		while(scanner.next!=null) {
			runner = scanner.next;
			prevRunner = scanner;
			while(runner.next!=null) {
				if(scanner.value == runner.value) {
					prevRunner.next = runner.next;
					//runner = null;
				}
				runner = runner.next;
				prevRunner = prevRunner.next;
			}
			scanner = scanner.next;
			
		}
		
		
	}
	
	public void addLastCircle(Object value) {
		
		node temp = header;
		while(temp.value!=value) {
			temp = temp.next;
		}
		node lastNode = header;
		while(lastNode.next!=null) {
			lastNode = lastNode.next;
		}
		
		node newNode = new node (value,temp);
		lastNode.next = newNode;
	}
	
	public void startPtCircular () {
		
		node slow = header.next;
		node fast = header.next.next;
		
		while(fast!= slow) {
			
			fast = fast.next.next;
			slow = slow.next;
		}
		slow = header;
		
		while(fast!=slow) {
			fast=fast.next;
			slow=slow.next;
		}
		
		System.out.println("Circular linked list at "+fast.value);
		
		
		
	}
	
	
	@Override
	public void addFirst (Object x) {
		// TODO Auto-generated method stub
		
		if(header.value == null) {
			node temp =new node(x,null);
			header=temp;
			count++;
		}
		else {
		node temp = new node(x,header);
		header = temp;
		count++;
		}	
	}

	@Override
	public void addLast(Object x) {
		// TODO Auto-generated method stub
		node temp =new node(x,null);
		temp = header;
		while(temp.next!=null){
			temp = temp.next;
		}
		node addnew = new node(x,null);
		temp.next = addnew;
		count++;
	}

	@Override
	public void add(Object x) {
		// TODO Auto-generated method stub
		System.out.println("After which value you want to add the element");
		Scanner a = new Scanner(System.in);
		Object comp = a.nextLine();
		System.out.println("Value "+comp);
		node temp = new node(null,null);
		temp = header;
		System.out.println("Temp Value "+temp.value);
		boolean flag = true;
		while(temp.value!=comp) {
			if(temp.next==null) {
				flag = false;
				break;
			}
			else {
				flag = true;
				temp = temp.next;
			}
		}
		System.out.println("Value is"+temp.value);
		if((flag) && (temp.value==x)) {
			node newnode = new node(x,temp.next);
			temp.next = newnode;
		}
		
	}

	@Override
	public void deleteFirst() {
		// TODO Auto-generated method stub
		node temp = new node(null,null);
		temp = header;
		header.value = null;
		header = header.next;
		count--;
	}

	@Override
	public void deleteLast() {
		// TODO Auto-generated method stub
		node temp =new node(null,null);
		temp = header;
		while(temp.next.next!=null){
			temp = temp.next;
		}
		temp.next = null;	
		count--;
	}

	@Override
	public void deleteAny(Object x) {
		// TODO Auto-generated method stub
		node parent = new node (null,null);
		node child = new node (null,null);
		parent = header;
		child = header.next;
		boolean flag = false;
		if(parent.value==x)
			flag = true;
		while(child.value!=x) {
			if(child.next == null) {
				System.out.println("Value is not present!!");
				flag = false;
				break;	
			}
			else {
				flag = true;
				child = child.next;
				parent = parent.next;
			}
		}
		if(flag) {
			System.out.println("Value is present and about to get deleted");
			parent.next = child.next;
			child.value = null;
			child = null;
		}

	}

	@Override
	public void search(Object x) {
		// TODO Auto-generated method stub
		node temp = new node(null,null);
		temp = header;
		System.out.println("Value of count is "+count);
		while(temp.value!=x) {
			if(temp.next==null) {
				System.out.println("Value not found!!");
				break;
			}
			temp = temp.next;
		}
		if(temp.value == x)
			System.out.println("Value found Yay!!");
	}
	
	public void merge2LinkedList() {
		
		
		
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
}
