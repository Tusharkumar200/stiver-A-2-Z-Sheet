 class Trapping_Rainwater{

     static int trap(int[] height) {
         int n = height.length;
        int left = 0, right = n - 1;
        int res = 0;
        int maxLeft = 0, maxRight = 0;

        while(left < right){
         if(height[left] <= height[right]){

            if(maxLeft > height[left]){
               res += maxLeft - height[left];
            }
            else{
               maxLeft = height[left];
            }
            
            left = left + 1;
         }
         else{
               if(maxRight > height[right]){
                  res += maxRight - height[right];
               }
               else{
                  maxRight = height[right];
               }
               right = right -1;
            }
        }
        return res;
     }

    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("The duplicate element is " + trap(arr));
    }
 }