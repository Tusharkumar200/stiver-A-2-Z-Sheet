import java.util.Arrays;
import java.util.HashMap;

class Replace_each_array_element_by_its_corresponding_rank{

    static int[] replaceWithRank(int arr[], int N) {
        HashMap<Integer ,Integer> mp = new HashMap<>();
        int temp =1;
        int brr[] = new int[N];
        
        for(int i=0; i<N;i++){
            brr[i] = arr[i];
        }
        Arrays.sort(brr);
        
        for(int i=0; i<N;i++){
            
            if(mp.get(brr[i])==null){
                mp.put(brr[i],temp);
                temp++;
            }
        }
        
        for(int i=0; i<N;i++){
            arr[i] = mp.get(arr[i]);
        }
        return arr;
    }
    public static void main(String[] args){
        int arr[] = {40, 10, 20, 30};
        int N = arr.length;

        System.out.println("Original Array: " + Arrays.toString(arr));
        int[] rankedArray = replaceWithRank(arr, N);
        System.out.println("Ranked Array: " + Arrays.toString(rankedArray));
    }
}