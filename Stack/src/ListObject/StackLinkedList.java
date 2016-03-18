package ListObject;

public class StackLinkedList implements StackMethod{

	public class Node {
		
		Object value;
		Node next;
		
		public void Node (Object value, Node next) {
			
			this.value=value;
			this.next= next;
		
		}
		
	}
	public int count= 0;
	
	public Node top = null;
	
	@Override
	public void push(Object x) {
		// TODO Auto-generated method stub
		
		Node temp = new Node ();
		temp.Node(x ,top);
		top = temp;
		count++;
		
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		top.value = null;
		top = top.next;
		count--;
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		System.out.println("The value of the top node is: "+top.value);
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		int var = 1;
		Node temp = new Node();
		temp = top;
		
		if (top == null) {
			System.out.println("Size of the stack is: 0");
		}
		else if(temp.next == null) {
			
			System.out.println("Size of the stack is: 1");
		}
		else  
		{	
			
		while(temp.next!= null) {
			var = var + 1;
			temp = temp.next;
		}
		System.out.println("Size of the stack is: "+var);
		}
		
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(top==null) {
			return true;
		}
		else
		return false;
	}
	

}
