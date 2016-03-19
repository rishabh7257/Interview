import java.util.LinkedList;
import java.util.Queue;

public class bfs {

	public static void main(String[] args) throws java.lang.Exception{
		// TODO Auto-generated method stub

		bfs i = new bfs();
		Node root = i.prepareTree();
		System.out.println("Breadth First Search : ");
		i.levelOrderQueue(root);
	}

	public void levelOrderQueue(Node root) {

		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()) {
			
			System.out.println(" " + q.peek().data);
			Node current = q.poll();
			if (current.left != null) {
				q.add(current.left);
			}
			if (current.right != null) {
				q.add(current.right);
			}
			
		}
	}
	
	public Node prepareTree() {
		Node root = new Node(5);
		root.left = new Node(10);
		root.right = new Node(15);
		root.left.left = new Node(20);
		root.left.right = new Node(25);
		root.right.left = new Node(30);
		root.right.right = new Node(35);
		
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
