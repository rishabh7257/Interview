
public class QueueArray implements Queue {
	
	public Object [] q = new Object[5];
	
	int top = 0, last = -1;
	int size = 0;
	
	@Override
	public void capacity(int x) {
		// TODO Auto-generated method stub
	 
	}

	@Override
	public void enqueue(Object x) {
		// TODO Auto-generated method stub
		if(size >= 10) {
			System.out.println("Dude the queue is already full");
		}
		else {
		
			last = last + 1;
			q[last]=x;
			size++;
		}
		//display();
	}
	
	void display() {
		for(int i = top;i <= last; i++) {
			System.out.println(""+q[i]);
		}
		
		
	}

	@Override
	public void dequeue() {
		// TODO Auto-generated method stub
		if(size==0) {
			System.out.println("Dude the queue is Empty");
		}
		else {
			System.out.println("The element which is poped out is: "+q[top]);
			q[top]=null;
			top = top + 1;
			size = size -1;
		}
		
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		System.out.println("First elemnet is: "+q[top]);
		System.out.println("Last elemnet is: "+q[last]);
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		System.out.println("Size of the queue is:  "+size);
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(size ==0) {
			System.out.println("The queue IsEmpty: "+true);
		}
		else {
			System.out.println("The queue IsEmpty: "+false);
		}
		return true;
	}

	

}
