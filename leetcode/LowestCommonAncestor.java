
public class LowestCommonAncestor {
	
	public TreeNode LCA(TreeNode root, TreeNode p, TreeNode q)
	{
		if(root == null) return null;
		if(root == p || root == q) return root;
		TreeNode L = LCA(root.left, p, q);
		TreeNode R = LCA(root.right, p, q);
		if(L!=null && R!=null) return root;
		
		return L!=null? L : R;
	}
	
	
	public TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q)
	{
		if(cover(root.left,p) && cover(root.left, q))
			return commonAncestor(root.left,p,q);
		
		if(cover(root.right,p) && cover(root.right, q))
			return commonAncestor(root.right,p,q);
		
		return root;
		
	}
	
	public boolean cover(TreeNode root, TreeNode p)
	{
		if(root == null) return false;
		if(root == p) return true;
		return cover(root.left,p) || cover(root.right, p);
	}
	
	

}
