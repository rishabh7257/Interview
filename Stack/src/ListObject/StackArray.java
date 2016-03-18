package ListObject;

public class StackArray implements StackMethod{
	
	private Object [] stack = new Object[10];
	private int size;
	
	public void setCapacity(int capacity) {
		stack = new Object[capacity];
	}
	@Override
	public void push(Object x) {
		// TODO Auto-generated method stub
		if(size == 10) {
	           throw new IllegalStateException("Stack is Full");
		}
		else{
			stack[size]=x;
			size=size+1;
			
		}
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		if(size == 0) {
	           throw new IllegalStateException("Stack is empty");
		}
		else {
			System.out.println("The element which is poped out is: "+ stack[size-1]);
			//stack[size--]=null;
			size =size-1;	
		}
	}

	@Override
	public Object peek() {
		// TODO Auto-generated method stub
		System.out.println("Top element on the list is: "+stack[size-1]);
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		System.out.println("The size of Stack will be: "+stack.length);
		return 0;
	}

	@Override
	public boolean isEmpty() {
		if(size == 0) {
	           System.out.println("Stack is empty");
	           return true;
		}
		else
		return false;
	}
	

}
