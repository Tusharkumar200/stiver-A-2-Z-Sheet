import java.util.HashMap;


public class Count_Number_of_Substrings {
    
   int countSubstr(String s, int k) {
        return countAtMost(s,k) - countAtMost(s,k-1);
    }
     int countAtMost(String s, int k){
        int l=0,count=0;
        HashMap<Character,Integer>map = new HashMap<>();
        for(int r=0; r<s.length(); r++){
            char ch = s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size() > k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                map.remove(s.charAt(l),0);
                l++;
            }
            count += (r-l+1);
        }
        return count;
    }
    
    public static void main(String[] args) {
    Count_Number_of_Substrings obj = new Count_Number_of_Substrings();
    String s = "abcba";
    int k = 2;
    int result = obj.countSubstr(s, k);
    System.out.println("The number of substrings with exactly " + k + " distinct characters is: " + result);
    }
}
