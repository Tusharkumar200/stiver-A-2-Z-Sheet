public class Sum_of_Beauty_of_All_Substrings {
    
     public int beautySum(String s) {
        int sum=0;
        int n = s.length();
        for(int i=0; i<n;i++){
            int []freq = new int[26];

            for(int j= i; j<n; j++){
                freq[s.charAt(j) -'a']++;
                int beauty = getMaxCount(freq) - getMinCount(freq);
                sum += beauty;
            }
        }
        return sum;
     }
     int getMaxCount(int[] freq){
        int max=0;
        for(int i=0; i<26;i++){
            max = Math.max(max,freq[i]);
        }
        return max;
    }

     int getMinCount(int[] freq){
        int min=0;
        for(int i=0; i<26;i++){
            min = Math.min(min,freq[i]);
        }
        return min;
    }

    public static void main(String[] args) {
        
    }
}
