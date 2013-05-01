import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BinaryTreeLevelOrderTraversal {
	
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	if(root == null) return null;
    	if(root.left == null && root.right == null)
    		return new ArrayList<ArrayList<Integer>>();
    	
    	Queue<TreeNode> currentLevel = new LinkedList<TreeNode>();
    	Queue<TreeNode> nextLevel = new LinkedList<TreeNode>();
        currentLevel.add(root);
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        
        while(!currentLevel.isEmpty())
        {
        	TreeNode node = currentLevel.poll();
        	if(node != null)
        	{
        		list.add(node.val);
        		if(node.left!=null)
        			nextLevel.offer(node.left);
        		if(node.right!=null)
        			nextLevel.offer(node.right);
        	}
        	if(currentLevel.isEmpty())
        	{
        		result.add(list);
        		list = new ArrayList<Integer>();;
        		currentLevel = nextLevel;
        		nextLevel = new LinkedList<TreeNode>();
        	}
        }
        
        return result;
    }

}
