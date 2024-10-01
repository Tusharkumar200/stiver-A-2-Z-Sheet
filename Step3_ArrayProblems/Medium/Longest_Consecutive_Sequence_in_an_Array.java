package Medium;

public class Longest_Consecutive_Sequence_in_an_Array {

    public static boolean linearSearch(int[]a , int num){

       
        for(int i: a){

            if(i == num) return true;
        }
        return false;
    }

    public static int longestSuccessiveElements(int []a){

        
        int longest  =1;


        for(int i: a ){
            int x = i;
            int cnt = 1;


            while (linearSearch(a, x+1) == true) {
                
                x+=1;
                cnt += 1;
            }

            longest  = Math.max(cnt, longest);
        }
        return longest;
    }
    
    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        int ans = longestSuccessiveElements(a);
        System.out.println("The longest consecutive sequence is " + ans);
    }
}
