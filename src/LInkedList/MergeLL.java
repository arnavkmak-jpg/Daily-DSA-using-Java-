package LInkedList;

public class MergeLL {
    public class ListNode {
      int val;
     ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0); //Creat a new node as a placeholder for the imaginary value before 1st node
        ListNode node = dummy; //represents the pointer which starts at node and iterates through both the lists

      while (list1!=null && list2!=null){ //while the lists aren't empty
          if (list1.val<list2.val){ //check if the value at list 1 is smaller than list 2
              node.next = list1; //put the node next to node as the next node since it has smaller value
              list1 = list1.next; //move to the next element of the list 1

          }
          else {
              node.next = list2;
              list2 = list2.next;
          }
          node = node.next; //move the node to next node (acts as a pointer)
      }

      if (list1!=null){  //after the loop ends with meeting one of the 2 conditions check if the 2nd condition is not met then we return the entire remaining list as the loop executed early because one list reached null value
          node.next = list1;  // we simply return the entire remaining list that is not null
      }
      else {
          node.next = list2;
      }

      return dummy.next; //since dummy is at null we return by the next element which will be the header, the entire merged and sorted linked list
  }
}
