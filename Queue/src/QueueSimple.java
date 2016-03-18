
import java.util.LinkedList;


public class QueueSimple implements Queue {
	
	LinkedList<Object> ls = new LinkedList<Object>();
	

	@Override
	public void capacity(int x) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void enqueue(Object x) {
		// TODO Auto-generated method stub
		ls.addFirst(x);
		
	}

	@Override
	public void dequeue() {
		// TODO Auto-generated method stub
		System.out.println("Last itme of the stack is been removed: "+ ls.getLast());
		ls.removeLast();
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		System.out.println("First itme of the stack is been removed: "+ ls.getFirst());
		System.out.println("Last itme of the stack is been removed: "+ ls.getLast());
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		System.out.println("Size of the queue is: "+ ls.size());
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(ls.isEmpty()) {
			System.out.println("Is empty is:"+ls.isEmpty());
		}
		else
		System.out.println("Is queue is empty: "+ ls.isEmpty());
		
		return false;
	}
	
	

}
