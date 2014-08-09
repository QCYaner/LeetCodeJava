import java.util.LinkedList;
import java.util.List;


public class BinaryTreePreorderTraversal {
	
	public class Solution {
	    
		
		
		  public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }
		
		
	    List<Integer> re = new LinkedList<Integer>();
	    public List<Integer> preorderTraversal(TreeNode root) {
	        if(root==null){
	            return re;
	        }
	        re.add(root.val);
	        preorderTraversal(root.left);
	        preorderTraversal(root.right);
	        
	        return re;
	    }
	}
}
