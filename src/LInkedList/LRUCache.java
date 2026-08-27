package LInkedList;


import java.util.HashMap;

public class LRUCache {

    private class Node{ //create a private class for a node
        int key; //each node will have a key value pair that is also put in a hashmap
        int value;
        Node prev; // prev and next nodes point to previous and next of the following node
        Node next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.prev = null; // initiate prev and next at null for now
            this.next = null;
        }
    }

    private int capacity; // capacity field
    private HashMap<Integer,Node> cache; // this is hashmap where we store each node as key value pairs
    private Node left; // this is our left dummy node
    private Node right; // this is our right dummy node

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>(); // create a hashmap with key and value pairs
        this.left = new Node(0,0); // initiate the left dummy node
        this.right = new Node(0,0);
        this.left.next = right; // initially the left dummy node will point to the right one
        this.right.prev = left; // vice versa


    }
    private void remove(Node node){ // make a helper method to remove a node
        Node prev = node.prev; // take previous and next nodes of the node to be removed
        Node next = node.next;
        prev.next = next; // here we point the previous node to node to the next node to the node and vice versa which removed the node
        next.prev = prev;

    }

    private void insert (Node node){// a helper method to insert a node to the right
        Node prev = right.prev; // previous of node will be the node previous to right and next of node will be the right
        Node next = right;
        prev.next = node;
        next.prev = node;
        node.prev = prev;
        node.next = next;
    }


    public int get(int key) {
        if (cache.containsKey(key)){// check if hashmap contains the node with a given key
            Node node = cache.get(key); // get the from the hashmap and put it in a node variable
            remove(node); // remove the node
            insert(node);// insert it to the right so it becomes most recently used
            return node.value; // return the value of the node that is stored in hashmap
        }
        return -1; //if we don't find the node we return -1
    }

    public void put(int key, int value) {
        Node node = cache.get(key);
        if (cache.containsKey(key)){
            remove(node);
        }
        Node newNode = new Node(key, value); // make a new node with given key and values
        cache.put(key,newNode); // put it in the hashmap
        insert(newNode); // now insert it in the linked list

        if (cache.size()>capacity){ // check if size of hashmap exceeds that of max capacity given
            Node lru = left.next; // lru will be the left most node which is next to the left dummy node
            remove(lru); // remove lru from the linked list
            cache.remove(lru.key); // now remove the lru from hashmap by getting it's key
        }



    }

}
