import java.util.Stack;

public class dfs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dfs i = new dfs();
		Node root = i.prepareTree();
		System.out.println("Depth First Search : ");
		i.printDepthFirstSearch(root);
	}
	
	void printDepthFirstSearch(Node root) {
		
		Stack<Node> stack = new Stack<Node>();
		stack.add(root);
		
		while(!stack.isEmpty()) {
			
			Node current = stack.pop();
			if (current.right != null) {
				stack.push(current.right);
			}
			if (current.left != null) {
				stack.push(current.left);
			}
			
			System.out.println(" " + current.data);
		}
		
		
	}
	
	public Node prepareTree() {
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right = new Node(3);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		return root;
	}

	class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

}
