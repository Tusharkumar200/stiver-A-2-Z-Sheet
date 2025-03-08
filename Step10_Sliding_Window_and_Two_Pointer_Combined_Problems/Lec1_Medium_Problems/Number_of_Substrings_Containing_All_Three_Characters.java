

public class Number_of_Substrings_Containing_All_Three_Characters {
    
    public int numberOfSubstrings(String s) {
        int lastSeen[] = new int[3];
        lastSeen[0] = -1;
        lastSeen[1] = -1;
        lastSeen[2] = -1;
        int count =0;

        for(int i=0; i<s.length();i++){
            lastSeen[s.charAt(i) - 'a'] = i;

            if(lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1){
                count = count + ( 1 + Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2])));
            }
        }
        return count;

    }
    public static void main(String[] args) {
        Number_of_Substrings_Containing_All_Three_Characters solution = new Number_of_Substrings_Containing_All_Three_Characters();
        String s = "abcabc";
        int result = solution.numberOfSubstrings(s);
        System.out.println("Number of substrings containing all three characters: " + result);
    }
}
