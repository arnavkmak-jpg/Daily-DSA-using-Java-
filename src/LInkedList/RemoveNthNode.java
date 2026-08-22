package LInkedList;

public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0,head); // we take a dummy node before head since we might need to delete the head
        ListNode left = dummy; // taking a left pointer that points to dummy node
        ListNode right = head; // a right pointer that points to head

        while (n>0){
            right = right.next; // we have to set right pointer at a node such that it has a difference of given n with the left pointer and we get the element previous to the element we need to remove
            n--;
        }

        while (right!=null){ //increment each till our right pointer is at the null
            left = left.next;
            right = right.next;
        }
        //at the end of the loop our left pointer will be at the node right before the node we have to remove

        left.next = left.next.next; //by doing this we remove the node next to the left pointer which is the node we need to remove

        return dummy.next; //now we just return the linked list with the nth node from the end removed



    }
}
