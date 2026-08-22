package LInkedList;

public class ReorderLL {
    public void reorderList(ListNode head) {
        ListNode slow = head; //taking two pointers and initiating them at the head of the linked list
        ListNode fast = head.next;

        while (fast!=null && fast.next!=null){ //execute the loop till the fast pointer is not null or the next node to fast is not null
            slow = slow.next; //jumping 1 node at a time with slow pointer
            fast = fast.next.next; // jumping 2 nodes at a time with fast pointer
        }
        // At the end of the loop our slow pointer will be at the mid point of the linkedlist

        ListNode second = slow.next; //taking the node next to our mid point as the start of 2nd half
        ListNode prev = slow.next = null; //taking the previous element as null such the last element of 1st half point towards null

        while (second!=null){ //while our pointer is not at null we apply the reverse linked list algorithm
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }

        ListNode first = head; //we take our first half starting from the head
        second = prev; //2nd half will be starting from prev (which is head of our reversed linked list)

        while (second!=null){
            ListNode temp1 = first.next; //we save the next node of 1st half to the temp node
            ListNode temp2 = second.next; //we do the same for 2nd one
            first.next = second; // we put the next element to the 1st header as the header of our 2nd reversed LL
            second.next = temp1; // now next element will be the next to the header of 1st half which is stored in temp1
            first = temp1; //now we increment each half by assigning the next node stored in temp
            second = temp2;
        }


    }
}
