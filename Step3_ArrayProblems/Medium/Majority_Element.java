package Medium;

import java.util.HashMap;
import java.util.Map;

public class Majority_Element {
    
    public static int Naive(int arr[]){
        int n = arr.length;
        
        for (int i : arr) {
            int count = 0;
            
            for (int j : arr) {
                
                if(j == i){
                    count++;
                }
            }

            if(count > (n/2))
                return i;
        }

        return -1;
    }
    // better approched
    public static int  majority(int num[]){
           
        int n = num.length;
        int i;
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for ( i = 0; i < n; i++) {
            int value = map.getOrDefault(num[i], 0);
            map.put(num[i], value + 1);
            }

        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
        return -1;
    }
    
    
    public static void main(String[] args) {
        int  nums[] = {2, 2, 1, 1, 1, 2, 2};

        // int res = majority(nums);
        // System.out.println(res);

        int resNive = Naive(nums);
        System.out.println(resNive);

        
    }
}
