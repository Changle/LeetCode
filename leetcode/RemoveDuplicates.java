/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class RemoveDuplicates {
	
    public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	
    	if(head == null)
    		return null;
    	
    	ListNode p = head;
    	ListNode q = p.next;
    	
    	while(q!=null)
    	{
    		while(q!=null && q.val ==  p.val)
    		{
    			p.next = q.next;
    			q = null;
    			q = p.next;
    		}
    		
    		if(q == null)
    			break;
    		
    		p = q;
    		q = p.next;
    	}
    	
    	return head;
    }
    
    public ListNode deleteDuplicates2(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	
    	if(head == null)
    		return null;
    	
    	ListNode current = head;
    	ListNode next_next = current;
    	
    	while(current.next !=null)
    	{
    		if(current.val == current.next.val)
    		{
    			next_next = current.next.next;
    			current.next = null;
    			current.next = next_next;
    		}else{
    			current = current.next;
    		}
    	}
    	
    	return head;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode head = new ListNode(1);
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(3);
		
		head.next = node1;
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		
		RemoveDuplicates app = new RemoveDuplicates();
		ListNode result = app.deleteDuplicates(head);
		
		while(result!=null)
		{
			System.out.println(result.val);
			result = result.next;
		}


	}

}
