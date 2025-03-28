public class Valid_Anagram {
    
    public boolean isAnagram(String s, String t) {
        int m = s.length();
        int n = t.length();

        if(m!=n){
            return false;
        }
        else{
            int cnt[] = new int[26];

            for(int i=0; i<m;i++){
                cnt[s.charAt(i) - 'a']++;
            }

            for(int i=0; i<n;i++){
                cnt[t.charAt(i) - 'a']--;
            }
            for(int i=0; i<cnt.length;i++){
                
                if(cnt[i] !=0){
                    return false;
                }
                return false; 
            }
            return true;
            
        }

    }
    public static void main(String[] args) {
        
    }
}
