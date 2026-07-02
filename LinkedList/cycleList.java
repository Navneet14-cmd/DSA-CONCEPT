class Solution {
    public boolean detectCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while ( fast!=null && fast.next!=null ) {
            slow=slow.next;
            fast = fast.next.next;
            if (slow == fast ) {
                return true;
            }

        }
        return false;

    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode (int val) {
        this.val = val;
        this.next= null;
    }
}

public class cycleList {
    public static void main (String [] args ){
        ListNode head = new ListNode(3);
        ListNode current = head;
        for (int i = 0 ; i < 3 ; i ++ ) {
            current.next = new ListNode(i+1);
            current = current.next;

        }
        Solution se = new Solution();
        System.out.println(se.detectCycle(head));

    }


    
}

