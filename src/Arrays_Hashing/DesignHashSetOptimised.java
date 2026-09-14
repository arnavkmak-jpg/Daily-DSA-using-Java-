package Arrays_Hashing;

import LInkedList.ListNode;

public class DesignHashSetOptimised {
    private static class ListNode{ // making a private class for ListNode
        int val;
        ListNode next;

        ListNode(int val){
            this.val = val;
        }

    }
    private final ListNode[] set; // array containing the ListNodes
    public DesignHashSetOptimised() {
        set = new ListNode[10000];
        for (int i=0; i< set.length;i++){ // iterate through the set and put initialise a Linked List in each index
            set[i] = new ListNode(0);

        }

    }

    public void add(int key) {
        ListNode dummy = set[key% set.length]; // assigning the corresponding dummy node at required index
        while (dummy.next!=null){
            if (dummy.next.val==key){ // check if key already exists in the linked list
                return;
            }
            dummy = dummy.next; // increment the dummy node if not found
        }
        dummy.next = new ListNode(key); // when we know next of dummy is null we put the key there as the new node

    }

    public void remove(int key) {
        ListNode dummy = set[key% set.length];
        while (dummy.next!=null){
            if (dummy.next.val==key){ // check if the value next to dummy is the value we need
                dummy.next = dummy.next.next; // if yes we remove the next by pointing the dummy to the next of next
                return;
            }
            dummy = dummy.next; // increment if not found
        }

    }

    public boolean contains(int key) {
        ListNode dummy = set[key% set.length];
        while (dummy.next!=null){
            if (dummy.next.val==key){ // if the value is found we return true
                return true;
            }
            dummy = dummy.next; // if not we increment till the dummy reaches the end return false if not found

        }
        return false;

    }
}
