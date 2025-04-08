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
        int min = Integer.MAX_VALUE;
        for(int i=0; i<26;i++){
            if(freq[i] > 0) { 
                min = Math.min(min, freq[i]);
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {
        Sum_of_Beauty_of_All_Substrings obj = new Sum_of_Beauty_of_All_Substrings();
        String s = "aabcb";
        int result = obj.beautySum(s);
        System.out.println("The sum of beauty of all substrings is: " + result);
    }
}
