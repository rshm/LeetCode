/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;
    
        while(fast!=null && fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow)
                break;
                //cycle found
        }
        
        if(fast==null || fast.next == null || fast.next.next == null){
            System.out.println("no cycle1");
            return null;
            
        }
        
        slow = head;
        
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
    
        return slow;

    }
}