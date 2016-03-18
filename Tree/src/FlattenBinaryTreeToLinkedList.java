import java.util.LinkedList;
import java.util.*;


public class FlattenBinaryTreeToLinkedList {

	public class Node {
	    Node left;
	    Node right;
	    int value;
	     
	    public Node(int value) {
	        left = null;
	        right = null;
	        this.value = value;
	    }
	}
	
	public Node createTree() {
		
		Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(4);
        root.left.left = new Node(6);
        root.left.right = new Node(5);
 
        root.right.left = new Node(9);
        root.right.right = new Node(11);
        root.right.right.left = new Node(7);
        root.right.right.right = new Node(3);
        
        return root;
	}
	
	public void convertTreeIntoLinkedList() {
		
		Node root = createTree();
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		LinkedList<Node> list = new LinkedList<Node>();
		
		while(!q.isEmpty()) {
			
			Node current = q.remove();
			
			if (current.left != null) {
				
				q.add(current.left);
				
			} 
			
			if (current.right != null) {
				
				q.add(current.right);
			}
			
			list.add(current);
		}
		readLinkedList(list);
	}
	
	public void readLinkedList(LinkedList<Node> list) {
		
			for(int i = 0; i< list.size(); i++) {
				
				System.out.println(list.get(i).value);
			}
			
		
		
	}
	public static void main(String[] args) {
		
		FlattenBinaryTreeToLinkedList converter = new FlattenBinaryTreeToLinkedList();
		converter.convertTreeIntoLinkedList();
		
	}
	
	

}
