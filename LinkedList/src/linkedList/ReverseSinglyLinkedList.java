package linkedList;

public class ReverseSinglyLinkedList {

	Node startNode;
    
    public static void main(String[] args) {
    	ReverseSinglyLinkedList reverseTheLinkedList = new ReverseSinglyLinkedList();
        reverseTheLinkedList.addNode(new Node(10));
        reverseTheLinkedList.addNode(new Node(20));
        reverseTheLinkedList.addNode(new Node(30));
        reverseTheLinkedList.addNode(new Node(40));
        reverseTheLinkedList.addNode(new Node(50));
         
        //Print List
        System.out.println("Original List is: ");
        reverseTheLinkedList.printLinkList(reverseTheLinkedList.startNode);
         
        Node reverseListHead = reverseTheLinkedList.reverseLinkList();
         
        //Reverse List
        System.out.println("\nReverse List is: ");
        reverseTheLinkedList.printLinkList(reverseListHead);
    }
 
    public Node reverseLinkList(){
       
    	Node ptr0 = null;
    	Node ptr1 = startNode;
    	
    	while(ptr1 != null) {
    		
    		Node ptr2 = ptr1.getNext();
    		ptr1.setNext(ptr0);
    		
    		ptr0 = ptr1;
    		ptr1 = ptr2;
    	}
    	
    	return ptr0;
    }
 
    private void printLinkList(Node startNode) {
        Node tempNode = startNode;
        while(tempNode!=null){
            System.out.print(tempNode.getData() + " ");
            tempNode = tempNode.getNext();
        }
    }
 
    private void addNode(Node node) {
        if(startNode!=null){
            Node tempNode = startNode;
            while(tempNode.getNext()!=null){
                tempNode = tempNode.getNext();
            }
            tempNode.setNext(node);
        }else{
            this.startNode = node;
        }
    }
}