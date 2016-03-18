
public interface Queue {

		void capacity (int x);
		
		void enqueue (Object x);
		
		void dequeue ();
		
		Object peek ();
		
		int size ();
		
		boolean isEmpty();

}
