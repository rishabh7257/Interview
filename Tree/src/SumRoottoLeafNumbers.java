import java.util.ArrayList;
import java.util.List;

public class SumRoottoLeafNumbers {

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
		root.left = new Node(0);
		root.right = new Node(3);
		root.left.left = new Node(4);
//		root.left.right = new Node(11);
//		root.left.left.left = new Node(5);
//		root.left.left.left.left = new Node(5);
//
//		root.right.left = new Node(9);
//		root.right.right = new Node(9);
//		root.right.right.left = new Node(10);
//		root.right.right.right = new Node(3);

		return root;
	}
//	static List<Integer> list = new ArrayList<Integer>();
//	
//	public static void generateNumber(Node current, String value, Node previous) {
//		
//		if (current == null) {
//			
//			if (!list.contains(Integer.parseInt(value))) {
//				list.add(Integer.parseInt(value));
//			}
//			return;
//			
//		}
//		
//		value = value + String.valueOf(current.value);
//		
//		generateNumber(current.left, value, previous);
//		generateNumber(current.right, value, previous);
//		
//	}
//	
//	public static int addArrayList() {
//		
//		int result = 0;
//		
//		for (int i = 0; i<list.size(); i++) {
//			
//			result = result + list.get(i);
//			
//		}
//		
//		return result;
//	}
//	
	 static int finalResult = 0;
	static int someSumNumberHelper(Node root, int result) {
        sumNumberHelper(root, result);
        return finalResult;
    }
    
    
    public static void sumNumberHelper(Node current, int result) {
        
        if (current == null) 
            return;
        
        if (current.left == null && current.right == null) {
            finalResult += result*10 + current.value;
            return;
        }
            
        result += result*10 + current.value;
        sumNumberHelper(current.left, result);
        sumNumberHelper(current.right, result);
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumRoottoLeafNumbers object = new SumRoottoLeafNumbers();
		Node root = object.createTree();
		int result = 0;
	        
		System.out.print("=========Result===========" +  someSumNumberHelper(root, result));

	}

}
