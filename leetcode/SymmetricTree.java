
public class SymmetricTree {
	
	public boolean isSymmetric(TreeNode a, TreeNode b)
	{
		if(a == null && b == null)
			return true;
		if(a == null && b != null)
			return false;
		if(a != null && b == null)
			return false;
		
		if(a.val != b.val)
			return false;
		else
			return isSymmetric(a.left,b.right) && isSymmetric(a.right,b.left);
		
	}
    public boolean isSymmetric(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	if(root == null)
    		return true;
    	
    	return isSymmetric(root.left,root.right);
        
    }

}
