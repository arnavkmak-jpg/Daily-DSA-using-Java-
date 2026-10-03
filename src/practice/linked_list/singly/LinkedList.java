package practice.linked_list.singly;



public class LinkedList {
    public static void main(String[] args){
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 1};
        Node head1 = arrayToLL(nums1);
        Node head2 = arrayToLL(nums2);
        Node head = reverseLLRecursion(head1);
        printLL(head);


    }
    // method to convert from array to linked list
    private static Node arrayToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = mover.next;
        }
        return head;

    }

    // print the Linked List
    private static void printLL(Node head){
        Node temp1 = head;
        while(temp1!=null){
            System.out.print(temp1.data + " ");
            temp1 = temp1.next;


        }
    }

    // method used to remove the current head
    private static Node removeHead(Node head){
        if (head == null) return head;
        head = head.next;
        return head;
    }

    // method used to remove tail/last node of the linked list
    private static Node removeTail(Node head){
        Node temp = head;
        if(head == null &&  head.next == null) return null;

        while(temp.next.next!=null){
            temp = temp.next;

        }
        temp.next = null;
        return head;

    }

    // method to delete the kth element
    private static Node removeKthElement(Node head, int k){
        if (head == null) return head;
        if (k == 1){
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null; // starts at null before head
        int count = 1;
        while(temp!=null){
            if (count == k){
                prev.next = prev.next.next;
                break;
            }
            count++;
            prev = temp;
            temp = temp.next;

        }


        return head;

    }

    private static Node removeValue(Node head, int val){
        if (head == null) return head;
        if (val == head.data){
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while (temp!=null){
            if (temp.data == val){
                prev.next = prev.next.next;
            }
            prev = temp;
            temp = temp.next;

        }
        return head;


    }

    // insert a node before the head
    private static Node insertHead(int nodeVal, Node head){
        Node temp = new Node(nodeVal, head);
        return temp;

    }

    // insert node at the tail of the LL
    private static Node insertTail(int nodeVal, Node head){
        Node temp = head;

        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new Node(nodeVal);
        return head;
    }

    // insert node before kth element

    private static Node insertBeforeKthElement(int nodeVal, Node head, int k){
        if (head == null) return new Node(nodeVal);

        if (k == 1){
            return new Node(nodeVal,head);
        }

        Node temp = head;
        int count = 1;
        while (temp!=null){
            if (count == k-1){
                Node newNode = new Node(nodeVal, temp.next);
                temp.next = newNode;
                break;

            }
            count++;
            temp =  temp.next;
        }
        return head;

    }

    // insert a node at any given value of a node

    private static Node insertBeforeValueOfX(int nodeVal, Node head, int X){
        if (head == null) return new Node(nodeVal);

        if (head.data == X){
            return new Node(nodeVal, head);
        }

        Node temp = head;
        while (temp.next != null){
            if (temp.next.data == X){
                Node newNode = new Node(nodeVal, temp.next);
                temp.next = newNode;
                break;
            }
            temp = temp.next;

        }
        return head;

    }

    private static Node addTwoNumsIoLL(Node n1, Node n2){
        Node temp1 = n1; // pointer that iterates through 1st LL
        Node temp2 = n2; // pointer that iterates through 2nd LL
        Node dummy = new Node(-1); // a dummy node to keep track of newly formed Sum LL
        Node curr = dummy;
        int carry = 0;
        int sum = 0;
        while(temp1!=null && temp2!=null){ // while one of the pointer reaches null loop keeps running
            sum = temp1.data + temp2.data + carry; // sum is value of each node and carry from previous sum
            if (sum>9){ // if our sum is greater than 10
                carry = sum / 10; // we put the tens digit in carry
                sum = sum % 10; // and we put the ones digit in sum
            }
            curr.next = new Node(sum); // then we put our sum as a new node next to dummy
            curr = curr.next; // move the dummy node to next
            temp1 =  temp1.next; // similarly move the pointers for each LL
            temp2 = temp2.next;

        }
        while(temp1!=null){ // check if one of the LL still has remaining nodes
            sum = temp1.data + carry;
            if (sum>9){
                carry = sum/10;
                sum = carry%10;
            }
            curr.next = new Node(sum);
            temp1 = temp1.next;
            curr = curr.next;
        }

        while(temp2!=null){ // check if one of the LL still has remaining nodes
            sum = temp2.data + carry;
            if (sum>9){
                carry = sum/10;
                sum = carry%10;
            }
            curr.next = new Node(sum);
            temp2 = temp2.next;
            curr = curr.next;
        }

        if (carry != 0){
            curr.next = new Node(carry);
        }

        return dummy.next;
    }

    private static Node addTwoNumbersToLL2(Node n1, Node n2){
        Node temp1 = n1;
        Node temp2 = n2;
        Node dummy = new Node(-1);
        Node curr = dummy;
        int carry = 0;

        while (temp1!=null || temp2!=null){
            int sum = carry;
            if (temp1!=null) sum += temp1.data;
            if (temp2!=null) sum += temp2.data;
            carry = sum / 10;
            sum =  sum % 10;
            curr.next = new Node(sum);
            curr = curr.next;
            if (temp1!=null) temp1 = temp1.next;
            if (temp2!=null) temp2 = temp2.next;

        }

        if (carry != 0){
            curr.next = new Node(carry);
        }

        return dummy.next;

    }

    private static Node oddEvenList(Node head){
        Node odd = head;
        Node even = head.next;
        Node evenHead = head.next; // store head.next since at the end LL will be modified and we will lose track of it since we have to connect it with odd LL

        // in even cases even no. of nodes even will end up at null and in odd no. of nodes even.next will be null
        while (even!=null && even.next!=null){
            // 1st we need to do odd since odd will be last element in odd no. of nodes so our loop will end after last value is added

            odd.next = odd.next.next; // put next to odd an element after next which is next odd index
            odd = odd.next; // now odd will jump to that node since odd.next is it's next

            even.next = even.next.next; // put next to even an element after next which is next even index
            even = even.next; // now even will jump to that node since even.next is it's next


        }

        odd.next = evenHead; // connect even LL to odd one

        return head;

    }

    private static Node LLZeroesAndOnes(Node head){
        if (head == null && head.next == null) return head;
        // temp pointer traverses through LL
        Node temp = head;
        // the 3 dummy nodes are for keep track of 3 LL each with diff values
        Node dummy1 = new Node(-1);
        Node dummy2 = new Node(-1);
        Node dummy3 = new Node(-1);
        // 3 pointers each for traversing through those 3 LL
        Node curr1 = dummy1;
        Node curr2 = dummy2;
        Node curr3 = dummy3;

        // loop runs till the temp is null
        while (temp!=null){
            if (temp.data == 0){
                curr1.next = temp; // if temp is 0,  1 or 2 we add it to it's corresponding LL
                curr1 = temp;
            }
            else if (temp.data == 1){
                curr2.next = temp;
                curr2 = temp;

            }
            else{
                curr3.next = temp;
                curr3 = temp;
            }

            temp = temp.next;


        }
        // finally we connect each of the newly formed LL
        curr1.next = (dummy2.next!=null)?dummy2.next:dummy3.next; // connect 1st LL to 2nd
        curr2.next =  dummy3.next;
        curr3.next = null;// then connect 2nd to third

        return dummy1.next; // return head of 1st LL



    }

    private static Node removeNthNodeFromBack(Node head, int n){
        if (head==null && head.next == null) return null;

        Node temp = head;
        Node prev = null;
        int count = 0;

        while (temp!=null){
            count++;
            temp = temp.next;
        }
        count = count-n;
        if (count == 0) { // if count is 0 we are to remove the head
            head = head.next;
            return head;
        }
        temp = head;
        while (temp!=null){
            if (count == 0) {
                prev.next = prev.next.next;
                temp.next = null;
                break;
            }
            prev = temp;
            temp = temp.next;
            count--;

        }
        return head;


    }

    private static Node removeNthFromBackOptimised(Node head, int n){
        Node fast = head;
        Node slow = head;

        for (int i = 0; i<n; i++) fast = fast.next; // move n times with fast pointer so the remaining will only be length of LL - n which lands slow at prev of nth

        while (fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;

    }

    private static Node reverseLL(Node head){
        if (head == null || head.next == null) return head;
        Node curr = head;
        Node prev = null;


        while(curr!=null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;

    }

    private static Node reverseLLRecursion(Node head){
        // base case
        if (head == null || head.next == null) return head;

        // recursive case
        Node newHead = reverseLLRecursion(head.next);

        Node front = head.next;
        front.next = head;
        head.next = null;

        return newHead;

    }



}
class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }


}


