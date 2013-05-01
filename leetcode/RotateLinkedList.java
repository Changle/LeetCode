
public class RotateLinkedList {
	
	public ListNode RotateN(ListNode node, int k)
	{
		ListNode current = node;
		ListNode oldTail ;
		ListNode newStart ;
		while(k>1)
		{
			current = current.next;
			k--;
		}
		
		newStart = current.next;
		current.next = null;
		current = newStart;
		
		while(current.next!=null)
			current = current.next;
		
		current.next = node;
		
		return newStart;
	}

}
