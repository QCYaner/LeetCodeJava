
public class ReorderList {
	
	class ListNode {
		    int val;
		    ListNode next;
		   ListNode(int x) {
		        val = x;
		       next = null;
		  }
		  }
	
public void reorderList(ListNode head) {
        
        if(head==null||head.next==null)
           return ;
        
        ListNode slow= head, fast=head,pre=null;
        //find mid:pre
        while(fast!=null && fast.next!=null){
            pre = slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        
        //ListNode newHead = slow.next;
        pre.next = null;
        //-------------------------------
        ListNode start = reverse(slow);
        
        /*ListNode p = head;
        ListNode tmp1,tmp2;
        while(p!=null){
            tmp1 = p.next; 
            p.next = start;
            p = tmp1;
            tmp2 = start.next;
            start.next = p;
            start = tmp2;
        }*/
        //-------------Merge
        ListNode tmpHead = new ListNode(0);
        ListNode q = tmpHead;
        
        while(head!=null && start!=null){
            q.next = head;
            q = q.next;
            head = head.next;
            q.next = start;
            q = q.next;
            start = start.next;
        }
    }
    
    public ListNode reverse(ListNode h){
        
        if(h==null||h.next==null)
        return h;
        
        ListNode pre=h, cur=h.next, next;
        
        while(cur!=null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        
        h.next = null;
        h = pre;
        return h;
        
    }

}
