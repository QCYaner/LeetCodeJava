import java.util.LinkedList;
import java.util.List;


public class BinaryTreePostorderTraversal {
	
	 public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	
	
List<Integer> result = new LinkedList<Integer>();
    
    public List<Integer> postorderTraversal(TreeNode root) {
        
        if(root==null){
            return result;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        //System.out.print(root.val +",");
        result.add(root.val);
        
        return result;
    }

}
