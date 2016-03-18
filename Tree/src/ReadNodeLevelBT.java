
import java.util.*;
import java.util.Map.Entry;

public class ReadNodeLevelBT {

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
	
	Map<Integer, LinkedList<Node>> map = new HashMap<Integer, LinkedList<Node>>();

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

	public void readNodeByNodeLevel(Node node, int level) {

		List<Node> list = new LinkedList<Node>();
		
		if (map.containsKey(level)) {
			
			list = map.get(level);
			list.add(node);
			map.replace(level, (LinkedList<Node>) list);
			
		} else {
			list.add(node);
			map.put(level, (LinkedList<Node>) list);
			
		}
		
		if (node.left != null) {
			
			readNodeByNodeLevel(node.left, level+1);
			
		} 
		
		if (node.right != null) {
			
			readNodeByNodeLevel(node.right, level+1);
			
		}
		
	}
	
	public String readLinkedList(LinkedList<Node> list) {

		String str = "";
		for (int i = 0; i < list.size(); i++) {

			str = str + " " + list.get(i).value;
		}

		return str;
	}
	
	public void readHashMap() {
		
		Iterator<Entry<Integer, LinkedList<Node>>> it = map.entrySet().iterator();
	    
		while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        LinkedList<Node> list = (LinkedList<Node>) pair.getValue();
	        
	        
	        System.out.println(pair.getKey() + " = " + readLinkedList(list));
	      	}
	    
	}
	
	public static void main(String[] args) {

		ReadNodeLevelBT reader = new ReadNodeLevelBT();
		Node root = reader.createTree();
		
		reader.readNodeByNodeLevel(root, 1);

		reader.readHashMap();
	}

}
