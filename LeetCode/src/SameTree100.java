
public class SameTree100 {
	
	//  Definition for a binary tree node.
	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 
	    public boolean isSameTree(TreeNode p, TreeNode q) {
	        
	        if (p == null && q == null) {
	            return true;
	        }
	        if (p == null && q != null) {
	            return false;
	        }
	        if (p != null && q == null) {
	            return false;
	        }
	        
	        while(p != null && q != null) {
	            
	            if (!(p.val == q.val)) {
	                return false;
	            }
	            if(p.left != null || q.left != null) {
	               if (!isSameTree(p.left,q.left)) {
	                   return false;
	               }
	                
	            } 
	            if (p.right != null || q.right != null) {
	                 if (!isSameTree(p.right,q.right)) {
	                     return false;
	                 }

	            }
	            return true;
	        }
	        return true;
	        
	    }
	}


