package Binary_Search;

import java.util.ArrayList;
import java.util.HashMap;

public class TimeBasedValue {

    class Record{
        String value;
        int timestamp;

        public Record(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }
    HashMap<String, ArrayList<Record>> map;

    public TimeBasedValue(){
        map = new HashMap<>();

    }
    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)){
            map.put(key,new ArrayList<>());

        }
        map.get(key).add(new Record(value, timestamp));


    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)){
            return "";
        }

        ArrayList<Record> list = map.get(key);

        int l = 0;
        int r = list.size()-1;

        while (l<=r){
            int mid = l+(r-l)/2;
            if (list.get(mid).timestamp > timestamp){
                r = mid-1;

            }
            else if(list.get(mid).timestamp < timestamp){
                l = mid+1;
            }
            else {
                return list.get(mid).value;
            }
        }
        if (r>=0){
            return list.get(r).value;
        }
        return "";

    }
}
