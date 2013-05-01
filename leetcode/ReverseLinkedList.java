
public class ReverseLinkedList {
	
	public ListNode RecursiveReverse(ListNode node)
	{
		if(node == null || node.next == null)
			return node;
		
		ListNode  remain = RecursiveReverse(node.next);
		
		node.next.next = node;
		node.next = null;
		
		return remain;
	}
	
	public ListNode IterativeReverse(ListNode node)
	{
		if(node == null || node.next == null)
			return node;
		
		ListNode previous = null;
		ListNode curr = node;
		while(curr!=null)
		{
			ListNode tmp = curr.next;
			curr.next = previous;
			previous = curr;
			curr = tmp;
		}
		
		return previous;
	}

}
