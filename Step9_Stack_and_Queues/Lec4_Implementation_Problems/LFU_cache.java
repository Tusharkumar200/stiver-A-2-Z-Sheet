import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class LFU_cache{
    
    Map<Integer, Integer> keyFreqListMap;
    
    Map<Integer, LinkedHashMap<Integer, Integer>> freqList;
    
    int cap;
    
    
    int min;
    public LFU_cache(int capacity) {
        cap = capacity;
        keyFreqListMap = new HashMap<>();
        freqList = new HashMap<>();
        freqList.put(1, new LinkedHashMap<>());
        min = 1;
    }
    
    public int get(int key) {
        if (!keyFreqListMap.containsKey(key)) return -1;
        
        int freq = keyFreqListMap.get(key);
        
        int val = freqList.get(freq).get(key);
        
        
        freqList.putIfAbsent(freq+1, new LinkedHashMap<>());
        freqList.get(freq+1).put(key, val);
        
        keyFreqListMap.put(key, freq+1);
        
        freqList.get(freq).remove(key);
        
        if (min == freq && freqList.get(freq).isEmpty()) min++;
        return val;
    }
    
    public void put(int key, int value) {
        if (keyFreqListMap.containsKey(key)) {
            int freq = keyFreqListMap.get(key);
            freqList.get(freq).remove(key);
            freqList.putIfAbsent(freq+1, new LinkedHashMap<>());
            freqList.get(freq+1).put(key, value);
            keyFreqListMap.put(key, freq+1);
            if (min == freq && freqList.get(freq).isEmpty()) min++;
        } else {
            if (keyFreqListMap.size() == cap) {
                keyFreqListMap.put(key, 1);
                Map.Entry<Integer, Integer> entry = freqList.get(min).entrySet().iterator().next();
                freqList.get(min).remove(entry.getKey());
                keyFreqListMap.remove(entry.getKey());
                freqList.get(1).put(key, value);
            } else {
                keyFreqListMap.put(key, 1);
                freqList.get(1).put(key, value);
            }
            min = 1;
        }  
    }
    public static void main(String[] args) {
        
    }
}