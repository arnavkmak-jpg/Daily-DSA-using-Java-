package LInkedList;

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CloneLL {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>(); //creating a hash map to store the old node and it's value
        map.put(null,null); //putting in null in the hashmap incase we get a null case where random might be pointing at null

        Node curr = head; //putting our current pointer at head
        while (curr!=null){
            Node copy = new Node(curr.val); // make a new node copy that copies the value of the node
            map.put(curr,copy); // put the node and it's value inside the map
            curr = curr.next; // increment the pointer to next node

        }

        curr = head; // put the pointer at head again
        while (curr!=null){ // instantiate the 2nd loop
            Node copy = map.get(curr); // assign the original node to the copy
            copy.next = map.get(curr.next); // assign next node to the next of copy
            copy.random = map.get(curr.random); // assign random to the random of copy
            curr = curr.next; // increment the original node
        }

        return map.get(head); //return the head stored in the map

    }
}
