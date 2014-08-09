
public class SortList {
	
	class ListNode {
		     int val;
		   ListNode next;
		   ListNode(int x) {
		      val = x;
		       next = null;
		   }
	}
	
	public ListNode sortList(ListNode head) {
        
	       if(head==null||head.next==null)
	       return head;
	       
	       return mergeSort(head);
	    }
	    
	    ListNode mergeSort(ListNode head){
	        
	         if(head==null||head.next==null)
	             return head;
	        
	        ListNode p = head, fast = head;
	        ListNode prep = null;
	        
	       
	        while(fast!=null && fast.next!=null){
	            prep = p;
	            p=p.next;
	            fast=fast.next.next;
	        }
	        
	        prep.next = null;
	        
	        ListNode left = mergeSort(head);
	        ListNode right = mergeSort(p);
	        
	        return merge(left,right);
	    }
	    
	    ListNode merge(ListNode l, ListNode r){
	        
	        ListNode tmpHead = new ListNode(0);
	        ListNode p = tmpHead;
	        
	        while(l!=null && r!=null){
	            if(l.val<=r.val){
	                p.next=l;
	                l=l.next;
	            }
	            else{
	                p.next=r;
	                r=r.next;
	            }
	            p=p.next;
	        }
	        
	        if(l==null){
	            p.next=r;
	        }
	        else{
	            p.next=l;
	        }
	        
	       // p=tmpHead.next;
	       //tmpHead.next=null;
	        
	        return tmpHead.next;
	    }

}
