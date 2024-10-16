public class Count_Reverse_Pairs {
    
    // * Brute Force (O(N^2))

    public static int countPairs(int[] a, int n) {

        int count = 0;

        for(int i=0; i<n; i++){

            for(int j = i+1; j<n; j++){

                if(a[i] > 2 * a[j]) count++;
            }
        }
        return count;
    }

    public static int team(int[] skill, int n) {
        return countPairs(skill, n);
    }

    public static void main(String[] args) {
        
        int[] a = {4, 1, 2, 3, 1};
        int n = 5;
        int result = team(a, n);
        System.out.println(result);

    }
}
