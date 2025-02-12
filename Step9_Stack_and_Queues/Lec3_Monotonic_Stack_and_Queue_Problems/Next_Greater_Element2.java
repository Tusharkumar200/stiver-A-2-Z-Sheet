import java.util.Stack;

class Next_Greater_Element2{

    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
       int nge[] = new int[n];
       Stack < Integer > st = new Stack < > ();

       for(int i = 2*n -1 ; i>=0;i-- ){

           while(!st.isEmpty() && st.peek() <= nums[i % n]){
               st.pop();
           }
           if(i<n){
               nge[i] = st.isEmpty() ? -1 : st.peek();
           }
           st.push(nums[i % n]);
       }
       return nge;
   }
    public static void main(String[] args) {
        Next_Greater_Element2 obj = new Next_Greater_Element2();
        int[] nums = {1, 2, 1};
        int[] result = obj.nextGreaterElements(nums);
        System.out.println("Next Greater Elements: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}