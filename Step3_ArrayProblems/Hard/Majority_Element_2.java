


import java.util.*;



public class Majority_Element_2 {
    
    public static List<Integer> majorityElement(int[]arr){
        
        int n=arr.length;
        int cnt1=0,cnt2=0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;

        for(int i=0; i< n; i++){

            if(cnt1 ==0 && el2 != arr[i]){
                cnt1 = 1;
                el1 = arr[i];

            }
            else if(cnt2 == 0 && el1 !=arr[i]){
                cnt2 = 1;
                el2 = arr[i];
            }
            else if(arr[i] == el1) cnt1++;
            else if(arr[i] == el2) cnt2++;
            else{cnt1--; cnt2--;}

        }

        List<Integer> ans = new ArrayList<>();

        cnt1 = 0;
        cnt2 = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == el1) cnt1++;
            if(arr[i] == el2) cnt2++;
        }

        int mini = (int) (n/3) +1;
        if(cnt1 >= mini) ans.add(el1);
        if(cnt2 >= mini) ans.add(el2);

        return ans;

    }
    public static void main(String[] args) {
        
        int[] arr = {11, 33, 33, 11, 33, 11};
        List<Integer> ans = majorityElement(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
