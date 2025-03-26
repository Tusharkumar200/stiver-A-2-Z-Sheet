public class Isomorphic_String {
    
     public boolean isIsomorphic(String s, String t) {
        int[] indexS = new int[200]; 
        int[] indexT = new int[200]; 
        
        
        int len = s.length();
        
       
        if(len != t.length()) {
            return false;
        }
        
    
        for(int i = 0; i < len; i++) {
            
            if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                return false; 
            }
            
           
            indexS[s.charAt(i)] = i + 1; 
            indexT[t.charAt(i)] = i + 1; 
        }
        
        
        return true;
    }
    
    public static void main(String[] args) {
        Isomorphic_String is = new Isomorphic_String();
        System.out.println(is.isIsomorphic("egg", "add")); // true
        System.out.println(is.isIsomorphic("foo", "bar")); // false
        System.out.println(is.isIsomorphic("paper", "title")); // true
    }
}
