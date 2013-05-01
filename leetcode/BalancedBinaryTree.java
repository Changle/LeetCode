import java.util.HashMap;
import java.util.Map;


public class BalancedBinaryTree {
	
	Map<TreeNode, Integer> map = new HashMap<TreeNode,Integer>();
	
    public boolean isBalanced(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	
    	map.put(null, 0);
    	if(root == null)
    	{
    		return true;
    	}
    	
    	if(isBalanced(root.left)&&isBalanced(root.right))
    	{
    		int left = map.get(root.left);
    		int right = map.get(root.right);
    		if(Math.abs(left-right)>1)
    			return false;
    		
    		int depth = left>right? left+1:right+1;
    		map.put(root, depth);
    		return true;
    					
    	}else{
    		return false;
    	}
        
    }

}
