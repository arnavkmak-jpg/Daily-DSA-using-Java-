//package practice.linked_list.doubly;
//
//
//
//public class DoublyLinkedList {
//    public static void main(String[] args){
//    int[] nums = {2, 3, 5, 8};
//    Node head = arrayToDLL(nums);
//
//    head = reverseDLL(head);
//    printDLL(head);
//
//
//}
//
//    // convert an array to a doubly linked list
//    private static Node arrayToDLL(int[] arr){
//        Node head = new Node(arr[0]);
//        Node prev = head; // put prev as head
//
//        for (int i = 1; i<arr.length; i++){
//            Node temp = new Node(arr[i], null, prev);
//            prev.next = temp;
//            prev = prev.next;
//
//        }
//        return head;
//
//    }
//
//    private static void printDLL(Node head){
//        Node temp = head;
//        while (temp!=null){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//
//        }
//
//
//    }
//
//    // remove head from a doubly linked list
//    private static Node removeHead(Node head){
//        if(head == null || head.next == null) return head;
//        head = head.next;
//        head.back = null;
//        return head;
//
//    }
//
//    // remove tail from a doubly linked list
//
//    private static Node removeTail(Node head){
//        if (head == null || head.next == null) return null;
//
//        Node temp = head;
//        while(temp.next!=null){
//            temp = temp.next;
//        }
//        Node prev = temp.back;
//        temp.back = null;
//        prev.next = null;
//
//
//        return head;
//
//    }
//
//    // remove element before kth element in doubly linked list
//
//    private static Node removeKthElement(Node head, int k){
//        if(head == null) return null;
//        Node temp = head;
//        int count = 1;
//        while(temp!=null){ // in order to find the desired kth element
//            if (count == k) break;
//            count++;
//            temp = temp.next;
//        }
//        Node prev = temp.back;
//        Node front = temp.next;
//
//        if (prev == null && front == null){ // check if there is no element or 1 element
//            return null;
//        }
//        if (prev == null){ // check if the kth element is head
//            head = head.next;
//            head.back = null;
//            return head;
//        }
//        if (front == null){ // check if the kth element is the tail
//            prev.next = null;
//            temp.back = null;
//            return head;
//        }
//        // if it is non of the edge cases
//
//        prev.next = front;
//        front.back =  prev;
//
//        temp.next = null;
//        temp.back = null;
//
//        return head;
//    }
//
//    // remove a given node in a doubly linked list
//
//    private static Node removeGivenNode(Node head, int nodeVal){
//        if(head == null) return null;
//        Node temp = head;
//
//        while(temp!=null){
//            if (temp.data == nodeVal) break;
//            temp = temp.next;
//        }
//
//        Node prev = temp.back;
//        Node front = temp.next;
//
//        if (prev == null && front == null){ // there is only single element
//            return null;
//        }
//        if (prev == null){ // it is head
//            head = head.next;
//            head.back = null;
//            return head;
//        }
//        if (front == null){ // it is tail
//            prev.next = null;
//            temp.back = null;
//            return head;
//        }
//
//        prev.next = front;
//        front.back = prev;
//
//        temp.back = null;
//        temp.next = null;
//
//        return head;
//
//    }
//
//    // remove a given node reference in a doubly linked list
//
//    private static void removeNode(Node node){ // won't be asked to remove head
//        Node prev = node.back;
//        Node front = node.next;
//
//        if (front == null){ // if the node is the tail
//            prev.next = null;
//            node.back = null;
//            return;
//        }
//
//        prev.next = front;
//        front.back = prev;
//
//        node.next = null;
//        node.back = null;
//
//
//    }
//
//    // insert and element before head
//
//    private static Node insertBeforeHead(Node head, int val){
//        if (head == null) return new Node(val);
//        Node newNode = new Node(val, head, null);
//        head.back = newNode;
//        return newNode;
//    }
//
//    // insert an element before tail
//
//    private static Node insertBeforeTail(Node head, int val){
//        if (head == null) return new Node(val);
//        if (head.next == null){
//            Node newNode = new Node(val, head, null);
//            head.back = newNode;
//            return newNode;
//
//        }
//
//        Node temp = head;
//        while(temp.next!=null){
//            temp = temp.next;
//        }
//        Node prev = temp.back;
//        Node newNode = new Node(val, temp, prev);
//        prev.next = newNode;
//        temp.back = newNode;
//
//        return head;
//    }
//
//
//    // insert before kth element
//
//    private static Node insertBeforeKthElement(Node head, int val, int k){
//        if (head == null) return null;
//        if (k == 1){
//            if (head == null) return new Node(val);
//            Node newNode = new Node(val, head, null);
//            head.back = newNode;
//            return newNode;
//        }
//        Node temp = head;
//        int count = 1;
//        while(temp.next!=null){
//            if (count == k){
//                break;
//            }
//            temp = temp.next;
//            count++;
//        }
//        Node prev = temp.back;
//        Node newNode = new Node(val, temp, prev);
//        prev.next = newNode;
//        temp.back = newNode;
//
//        return head;
//    }
//
//    // insert before any given node
//
//    private static void insertBeforeNode(Node node, int val){
//        Node prev = node.back;
//        Node newNode = new Node(val, node, prev);
//        node.back = newNode;
//        prev.next = newNode;
//
//    }
//
//    private static Node reverseDLL(Node head){
//        Node curr = head; // take the dummy node as the head
//        Node prev = null;
//        while (curr!=null){ // iterate through DLL until curr is null
//            prev = curr.back; // store the back value
//            curr.back = curr.next; // swap back and next value
//            curr.next = prev;
//
//            curr = curr.back; // to move forward we put back value since back value is front value after swapping
//        }
//        return prev.back; // at the last iteration curr will be at last element and prev will be at 2nd last after last iteration curr will be at null so prev.back will give the last element which is head
//    }
//
//
//
//
//
//}
//
//class Node{
//    int data;
//    Node next;
//    Node back;
//
//    Node(int data, Node next, Node back){
//        this.data = data;
//        this.next = next;
//        this.back = back;
//
//    }
//
//    Node(int data){
//        this.data = data;
//        this.next = null;
//        this.back = null;
//
//    }
//
//
//}
//
