package ListObject;

import java.util.LinkedList;

public class StackFunction implements StackMethod {
	
	LinkedList<Object> list = new LinkedList<Object>();
	
	@Override
	public void push(Object x) {
		// TODO Auto-generated method stub
		list.addFirst(x);
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		list.removeFirst();
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		return list.getFirst();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return list.isEmpty();
	}
	
}
