package ListObject;

public class Stack {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//StackFunction a = new StackFunction();
		//StackArray arr = new StackArray();
		StackLinkedList ls = new StackLinkedList();
		//System.out.println("Size of the stack is: " +a.size());
		/*a.isEmpty();
		a.push(1);
		a.push(2);
		a.push(3);
		a.push(4);
		a.push(5);
		a.push(6);
		a.peek();
		a.pop();
		a.pop();
		a.pop();
		a.peek();
		a.size();
		*/
		//arr.size();
		//arr.setCapacity(10);
		/*arr.push(6);
		arr.push(10);
		arr.push(11);
		arr.pop();
		arr.peek();
		System.out.println("Is Empty: "+arr.isEmpty());
		*/
		
		//Function to check linked list stack:

		System.out.println("Is Empty: "+ls.isEmpty());
		ls.size();
		ls.push(2);
		ls.peek();
		ls.size();
		ls.push(3);
		ls.push(4);
		ls.peek();
		ls.size();
		ls.push(5);
		ls.size();
		System.out.println("Is Empty: "+ls.isEmpty());
		
		
	}

	
	
}
