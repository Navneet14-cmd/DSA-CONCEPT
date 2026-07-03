class Solution {
    public static ListNode inserAtPositionK (ListNode head, int val , int k ) {
        ListNode dummy = new ListNode (0);
        dummy.next = head; 
        ListNode current = dummy;

        for (int i = 0 ; i < k ; i ++ ) {
            current = current.next;
        }
        ListNode newNode = new ListNode (val);
        ListNode temp = current.next;
        current.next = newNode;
        newNode.next = temp;
        return dummy.next;
    }

}


class ListNode {
    int val;
    ListNode next;

    ListNode (int val){
        this.val = val;
        //this.next = null;

    }
}
public class insertAtPosition {
    public static void main(String[] args) {

        int arr [] = {15,12,5,6,1};
        ListNode head = new ListNode(arr[0]);
        ListNode tail = head;
        for (int i = 1; i < arr.length ; i ++) {
            tail.next = new ListNode(arr[i]);
            tail = tail.next;
        }   

        head = Solution.inserAtPositionK(head , 10 , 3);
        
        while (head!=null){
            System.out.println(head.val);
            head = head.next;
        }

       
    }
    
}
