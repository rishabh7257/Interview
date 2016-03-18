
public class QueueLinkedList implements Queue{

	class node {
		
		Object value;
		node next;
		
		public void node(Object value, node next) {
			
			this.value = value;
			this.next = next;
		}
		
	}
	
	node head = null;
	node tail = null;
	int size = 0;
	@Override
	public void capacity(int x) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enqueue(Object x) {
		// TODO Auto-generated method stub
		if(head == null) {
			
			node temp=new node();
			temp.node(x, null);
			head = temp;
			tail = temp;
			size = size + 1;
		}
		
		else {
			
			node temp = new node();
			temp.node(x, null);
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
			System.out.println("The element which is about to poped out is: " +head.value);
			head.value = null;
			head = head.next;	
			size = size - 1;
		}			
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		/*node temp = head;
		while(temp.next!= null) {
			System.out.print(" "+temp.value);
			temp=temp.next;
		}
		*/
		node temp1=head;
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
		if(head==null) {
		return true;
		}
		else return false;
	}

}
