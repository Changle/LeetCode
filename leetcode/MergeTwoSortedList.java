
public class MergeTwoSortedList {
	
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2)
	{
		if(l1 == null)
			return l2;
		if(l2 == null)
			return l1;
		
		ListNode head = l1.val < l2.val? l1:l2;
		ListNode temp = new ListNode(0);
		while(l1 != null && l2 != null)
		{
			if(l1.val < l2.val)
			{
				temp.next = l1;
				temp = l1;
				l1 = l2.next;
			}else{
				temp.next = l2;
				temp = l2;
				l2 = l2.next;
			}
		}
		
		if(l1 == null)
			temp.next = l2;
		if(l2 == null)
			temp.next = l1;
		
		return head;
		
	}
	
	
	public ListNode mergeSort(ListNode a, ListNode b)
	{
		ListNode result = null;
		if(a == null)
			return b;
		if(b == null)
			return a;
		
		if(a.val < b.val)
		{
			result = a;
			result.next = mergeSort(a.next,b);
		}else
		{
			result = b;
			result.next = mergeSort(a,b.next);
		}
		
		return result;
	}

}
