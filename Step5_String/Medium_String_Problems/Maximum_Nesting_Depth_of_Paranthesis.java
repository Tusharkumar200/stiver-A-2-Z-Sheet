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
        Maximum_Nesting_Depth_of_Paranthesis obj = new Maximum_Nesting_Depth_of_Paranthesis();
        String testString = "(1+(2*3)+((8)/4))+1";
        int result = obj.maxDepth(testString);
        System.out.println("The maximum nesting depth of the parentheses is: " + result);
    }
}
