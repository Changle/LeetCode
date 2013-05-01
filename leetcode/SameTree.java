
public class SameTree {
	
	
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	 if(p == null && q == null)
             return true;
    	if(q == null && p != null)
    		return false;
    	if(q != null && p == null)
    		return false;
    	
    	if(p.val != q.val)
    		return false;
    	else return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    	
    	
        
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
