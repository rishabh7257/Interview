import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<Integer> preorderTraversal(TreeNode root) {

		List<Integer> list = new ArrayList<Integer>();

		Stack<TreeNode> stack = new Stack<TreeNode>();

		stack.push(root);
		
		while(!stack.isEmpty()) {
			
			list.add(root.val);
			TreeNode current = stack.pop();
			if (current != null) {
				if (current.right != null) {
					stack.push(current.right);
				} 
				
				if (current.left != null) {
					
					stack.push(current.left);
					
				}
			}
		}
		
		return list;
				

	}
}
