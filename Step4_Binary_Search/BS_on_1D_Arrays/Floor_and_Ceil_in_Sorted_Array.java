package BS_on_1D_Arrays;
public class Floor_and_Ceil_in_Sorted_Array {
    
    static int findFloor(int[] arr, int n, int x) {
        int low=0;
        int high= n-1;
        int ans = -1;

        while(low <= high){
            int mid= (low + high)/2;

            if(arr[mid] <= x){
                   ans = arr[mid];
                   low = mid + 1; 
            }else{
                high = mid -1;
            }
        }
        return ans;
    }

    static int findCeil(int[] arr, int n, int x){
        int low =0;
        int high = n-1;
        int ans = -1;

        while(low <=high){
            int mid = (low + high)/2;

            if(arr[mid] >= x){
                ans = arr[mid];
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int[] getFloorAndCeil(int[] a, int n, int x) {
                   int f = findFloor(a, n, x);
                   int c = findCeil(a, n, x);
                   return new int[] {f,c};
    }
    public static void main(String[] args) {
        int n = 6;
        int  arr[] ={3, 4, 4, 7, 8, 10};
        int  x= 5;
        getFloorAndCeil(arr,n,x);
        int[] ans = getFloorAndCeil(arr, n, x);
        System.out.println("The floor and ceil are: " + ans[0] + " " + ans[1]);
    }
}
