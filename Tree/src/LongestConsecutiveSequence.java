import java.util.LinkedList;

public class LongestConsecutiveSequence {

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
		root.left = new Node(3);
		root.right = new Node(8);
		root.left.left = new Node(4);
		root.left.right = new Node(11);
		root.left.left.left = new Node(5);
		root.left.left.left.left = new Node(5);

		root.right.left = new Node(9);
		root.right.right = new Node(9);
		root.right.right.left = new Node(10);
		root.right.right.right = new Node(3);

		return root;
	}

	
	public String readLinkedList(LinkedList<Node> list) {

		String str = "";
		for (int i = 0; i < list.size(); i++) {

			str = str + " " + list.get(i).value;
		}

		return str;
	}
	
	static int result = 1;
	
	public static void findLongestConsecutiveSequence(Node current, int curr, Node previous) {
		
		if (current == null) {
			
			return ;
					
		} 
		
		if (current.value == (previous.value + 1)) 
			
			curr ++;
		 
		 else 
			
			curr = 1;
				
		result = Math.max(result, curr);
		
		findLongestConsecutiveSequence(current.left, curr, current);
		findLongestConsecutiveSequence(current.right, curr, previous);
		 
	}
	
	
	public static void main(String[] args) {

		System.out.print("=========Longest Consecutive Sequence============");
		
		LongestConsecutiveSequence seq = new LongestConsecutiveSequence();
		
		Node root = seq.createTree();
		
		findLongestConsecutiveSequence(root, 1, root);
		
		System.out.print("=========Result===========" + result);

	}

}
