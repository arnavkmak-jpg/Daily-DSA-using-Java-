package LInkedList;

import java.util.HashSet;

public class LLCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast!=null && fast.next!=null){ //loop till fast is not null ie it reaches last element or we get an acyclic odd linked list for which fast will be stuck at last element so we check if next is null
            slow = slow.next; //slow pointer will take 1 step at a time
            fast = fast.next.next; //fast pointer will take 2 step at a time
            if (fast == slow){ //if our slow and fast pointer matches which they are guaranteed to if we have a cyclic linked list we return true
                return true;
            }

        }
        return false;




        }
}
