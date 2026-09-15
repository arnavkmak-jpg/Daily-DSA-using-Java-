package Arrays_Hashing;

public class DesignHashMap {
    private static class ListNode{
        int key;
        int val;
        ListNode next;

        public ListNode(int key, int val, ListNode next){
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }
    private final ListNode[] map;
    public DesignHashMap() {
        map = new ListNode[10000];
        for (int i = 0; i< map.length; i++){
            map[i] = new ListNode(0,0,null); // fill the entire array with dummy nodes
        }

    }

    public void put(int key, int value) {
        ListNode dummy = map[key% map.length]; // each key is % by 10000 each time to determine at which index it should be assigned to in order to prevent out of bounds with number larger than 10000
        while (dummy.next!=null){
            if (dummy.next.key == key){ // check if the key already exists in the linked list
                dummy.next.val = value; // if it does we update the value to the given value
                return;
            }
            dummy =  dummy.next; // if the node next to dummy is not the required one then we move dummy to next
        }
        dummy.next = new ListNode(key,value,null); // if our while loop fails we add the new node with key and value at the end of the linked list
    }

    public int get(int key) {
        ListNode dummy = map[key % map.length];
        while(dummy.next!=null){
            if (dummy.next.key == key){ // if the node next to dummy is our required node we simply return the val stored in the node
                return dummy.next.val;
            }
            dummy = dummy.next; // if not we will increment it till we find one
        }
        return -1;
    }

    public void remove(int key) {
        ListNode dummy = map[key % map.length];
        while (dummy.next!=null){
            if (dummy.next.key == key){
                dummy.next = dummy.next.next;
                return;
            }
            dummy = dummy.next;
        }

    }
}
