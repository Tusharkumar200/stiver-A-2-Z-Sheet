package Medium;

public class Two_Sum {
    
    public static int[] sum(int arr[] , int target){
        
        int index[] = new int[2]; 
        for ( int i : arr) {
            
                for ( int j : arr) {
                    if(i == j) continue;

                    if(i + j== target){
                        // System.out.print((i +" " + j));
                        index[0] = i;
                        index[1] = j;
                        
                    }
                }
                    
        }

        
        return index;
    }
    public static void main(String[] args) {
        
        int arr[] = {2,6,5,8,11};
        int target = 8;
        int result[] = sum(arr, target);
        for (int i : result) {
                System.out.print(i + " ");
        }
    }
}
