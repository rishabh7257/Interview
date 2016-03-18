package Double;

import Double.Definition;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Definition ll = new Definition ();
		ll.addNode(1);
		ll.addNode(2);
		ll.addNode(3);
		ll.addNode(4);
		//ll.insert(3,2);
		ll.addNode(5);
		//ll.addNode(6);
		ll.display();
		
		System.out.println("\n");
		ll.deleteAlternate();
		ll.display();
		
	}

}
