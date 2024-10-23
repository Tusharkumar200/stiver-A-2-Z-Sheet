import java.util.*;

public class Implement_Upper_Bound {
    
public static int[]upper_bond(int[]arr , int x){
        int n = arr.length;
        Arrays.sort(arr);
        int left =0;
        int right = n-1;


        while(left <= right){
            int mid = (left +right)/2;
            if(arr[mid] == x)return new int[]{x,x};
            else if(arr[mid] <x){left = mid + 1;}
            else right = mid -1;
        }
        int a= 0, b =0;
        if(left >n -1 || left < 0){a= -1;}
        else a = arr[left];
        if(right > n-1 || right<0){b= -1;}
        else b=arr[right];
        return new int[]{b,a};
    }
    public static void main(String[] args) {
        
       int arr[] = {3,5,8,9,15,19}, x = 9;
       int[] result =  upper_bond(arr, x);
       
       for (int i : result) {
            System.out.println(" "+i);
       }
    }
}
