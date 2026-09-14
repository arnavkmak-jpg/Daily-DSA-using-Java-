package Arrays_Hashing;

import java.util.ArrayList;

public class DesignHashSet {
    ArrayList<Integer> list = new ArrayList<>();
    public DesignHashSet() {


    }

    public void add(int key) {
        list.add(key);

    }

    public void remove(int key) {
        for (int i=0; i< list.size(); i++){
            if (list.get(i)==key){
                list.remove(i);
            }
        }

    }

    public boolean contains(int key) {
        if (list.contains(key)){
            return true;
        }
        else {
            return false;
        }

    }
}
