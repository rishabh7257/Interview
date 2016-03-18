

public class QueueLinkedListWoHead implements Queue {

	class node {
		
		Object value;
		node next;
		
		public void node(Object value, node next) {
			
			this.value = value;
			this.next = next;
		}
		
	}
	
	node tail = null;
	int size = 0;
	@Override
	public void capacity(int x) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enqueue(Object x) {
		// TODO Auto-generated method stub
		if(tail == null) {
			
			node temp=new node();
			temp.node(x, temp);
			tail = temp;
			size = size + 1;
		}
		
		else {
			
			node temp = new node();
			temp.node(x, tail.next);
			tail.next=temp;
			tail=temp;
			size = size + 1;
		}

	}

	@Override
	public void dequeue() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("The queue is empty dude!");
		}
		else {
			node temp = new node();
			temp = tail.next;
			System.out.println("The element which is about to poped out is: " +temp.value);
			temp.value = null;
			tail.next = temp.next;	
			size = size - 1;
		}	

	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		node temp1=tail.next;
		for(int i=0;i<size;i++) {
			System.out.println(""+temp1.value);
			temp1=temp1.next;
		}
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		System.out.println("The size of the queue is "+size);
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(tail==null) {
			return true;
			}
			else {
				return false;
			}
		
	}

}
