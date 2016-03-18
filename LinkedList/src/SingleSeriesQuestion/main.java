package SingleSeriesQuestion;



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Definition ll = new Definition ();
		
		ll.addLast(1);
		ll.addLast(2);
		ll.addLast(3);
		ll.addLast(0);
		ll.addLast(5);
		ll.addLast(4);
		ll.addLast(0);
		ll.addLast(3);
		ll.addLast(2);
		ll.addLast(0);
		
		ll.display();
		System.out.println("\n");
		ll.addBeforeZero();
		ll.display();
		
		
	}

}
