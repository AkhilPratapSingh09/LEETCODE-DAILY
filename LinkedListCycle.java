public class LinkedListCycle {
    
 
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
public class Solution {
    public boolean hasCycle(ListNode head) {
        // If head is null, return false
        if (head == null) {
            return false;
        }
        
        // Initialize two pointers, fast and slow, and assign them to head
        ListNode fast = head;
        ListNode slow = head;
        
        // Traverse the list until fast and fast.next reach null
        // Increment fast by 2 steps and slow by 1 step
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            
            // If fast and slow point to the same node, there is a cycle
            if (fast == slow) {
                return true;
            }
        }
        
        // If traversal reaches null, there is no cycle
        return false;
    }
}
}
