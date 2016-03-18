import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderTraversal {

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

	public List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> list = new ArrayList<Integer>();

		Stack<TreeNode> stack = new Stack<TreeNode>();

		TreeNode current = root;
		stack.add(current);
		while (!stack.isEmpty()) {

			current = stack.peek();
			if (current.left != null) {
				stack.push(current.left);
				current = current.left;
			} else if (current.right != null) {
				stack.push(current.right);
				current = current.right;
			} else {
				list.add(current.val);
				stack.pop();
			}
			
			
		}
		
		return list;
				

	}
}
