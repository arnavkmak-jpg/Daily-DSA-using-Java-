package LInkedList;

public class AddTwoNos {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;


        int carry = 0;
        while (l1!=null || l2!=null || carry!=0){
            int v1 = (l1!=null)? l1.val:0; // check if l1 node is not null if it is not we return value of l1 else we return 0
            int v2 = (l2!=null)? l2.val:0;

            int val = v1+v2+carry; // addition of value of each node
            carry = val/10; // we perform integer division to get the carry for ex 15/10 = 1
            val = val%10; // we perform modulus to extract the first digit for ex 15%10 = 5

            curr.next = new ListNode(val); //putting the value in next node to the current node (dummy node at start)

            curr = curr.next; // increment the curr pointer

            l1 = (l1!=null)? l1.next:null; // incrementing both the nodes for addition of next digit return null if it is at null
            l2 = (l2!=null)? l2.next:null;

        }

        return dummy.next;

    }
}
