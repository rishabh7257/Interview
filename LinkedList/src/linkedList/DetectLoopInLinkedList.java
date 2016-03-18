package linkedList;

public class DetectLoopInLinkedList {

	private Node startNode;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DetectLoopInLinkedList detectLoopInLinkedList = new DetectLoopInLinkedList();

		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		Node n6 = new Node(60);
		Node n7 = new Node(70);
		Node n8 = new Node(80);

		detectLoopInLinkedList.startNode = n1;

		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		n5.setNext(n6);
		n6.setNext(n7);
		n7.setNext(n8);
		n8.setNext(n6);

		if (isLoopPresent(detectLoopInLinkedList.startNode)) {
			System.out.println("Loop is present in list");
		} else {
			System.out.println("No Loop present in list");
		}
	}

	private static boolean isLoopPresent(Node startNode) {

		Node ptr1 = startNode;
		Node ptr2 = ptr1.getNext();
		
		while ((ptr1.getNext() != null) || (ptr2.getNext() != null)) {
			
			if (ptr1 == ptr2) {
				
				return true;
				
			} else {
				
				ptr1 = ptr1.getNext().getNext();
				ptr2 = ptr2.getNext();
			}
				
				
			
		}
		return false;
	}
}
