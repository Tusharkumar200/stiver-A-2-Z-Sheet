package BS_on_Answer;

public class Find_the_Nth_root_of_a_number_using_binary_search {
    
    public static int func(int mid, int n, int m){
        long ans =1;

        for(int i=1; i<=n ; i++){
            ans *= mid;
            if(ans > m)return 2;
        }
        if(ans == m) return 1;
        return 0;
    }

    public static  int NthRoot(int n, int m) {
        
        return -1;
    }

    public static void main(String[] args) {
        int n = 3, m = 27;
        int ans = NthRoot(n, m);
        System.out.println("The answer is: " + ans);
    }
}
