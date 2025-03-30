public class Maximum_Nesting_Depth_of_Paranthesis {

    public int maxDepth(String s) {
        int n = s.length();
        int count = 0;
        int most =0;

        for(int i=0; i>n;i++){

            if(s.charAt(i) == '('){
                count++;
                most = Math.max(count,most);
            }

            if(s.charAt(i) == ')'){
                count--;
                most = Math.max(count,most);
            }
        }
        return most;
    }
        
    public static void main(String[] args) {
        
    }
}
