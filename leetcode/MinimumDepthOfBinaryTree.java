
public class MinimumDepthOfBinaryTree {
	
    public int minDepth(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	if(root == null)
    		return 0;
    	
    	int left = minDepth(root.left) + 1;
    	int right = minDepth(root.right) + 1;
    	
    	if(left == 1||right == 1)
    		return left > right? left:right;
 
    	
    	return left<right?left:right;
    	
        
    }

}
