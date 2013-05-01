
public class AddLinkedList {
	
	ListNode addLinkedList(ListNode l1, ListNode l2, int carry)
	{
		if(l1 == null && l2 == null)
			return null;
		
		ListNode result = new ListNode(carry);
		int val = carry;
		if(l1 != null)
			val += l1.val;
		if(l2 != null)
			val += l2.val;
		
		result.val = val %10;
		
		ListNode more = addLinkedList((l1 == null ? null: l1.next),
									   (l2 == null ? null: l2.next),
									   (val > 10 ? 1:0));
		
		result.next = more;
		return result;
	}

}
